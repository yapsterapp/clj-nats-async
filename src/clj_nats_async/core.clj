(ns clj-nats-async.core
  (:require [clojure.string :as str]
            [manifold.stream :as s])
  (:import [nats.client NatsConnector MessageHandler Message]))

(defn create-nats
  "creates a Nats connection, returning a Nats object
   - urls : nats server urls, either a seq or comma separated"
  [& urls]
  (let [nc (NatsConnector.)]
    (doseq [url (flatten (map #(str/split % #",") urls))]
      (.addHost nc url))
    (.connect nc)))

(defprotocol INatsSubscription
  (close [self]))

(defrecord NatsSubscription [nats nats-subscription stream]
  INatsSubscription
  (close [_]
    (.close nats-subscription)
    (s/close! stream)))

(defprotocol INatsMessage
  (msg-body [self]))

(defrecord NatsMessage [nats-message]
  INatsMessage
  (msg-body [self] (.getBody nats-message)))

(defn subscribe
  "returns an INatsSubscription with a stream of INatsMessages"
  ([nats subject] (subscribe nats subject {}))
  ([nats subject {:keys [queue-group max-messages] :as opts}]
   (let [stream (s/stream)
         nats-subscription (.subscribe
                            nats
                            subject
                            queue-group
                            max-messages
                            (into-array
                             MessageHandler
                             [(reify
                                MessageHandler
                                (onMessage [self m]
                                  (s/put! stream (NatsMessage. m))))]))]
     (NatsSubscription. nats nats-subscription stream))))

(defn publish
  "publish a message"
  ([nats subject] (publish nats subject "" {}))
  ([nats subject body] (publish nats subject body {}))
  ([nats subject body {:keys [reply-to] :as opts}]
   (.publish nats subject body reply-to)))

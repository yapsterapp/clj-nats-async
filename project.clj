(defproject alexeypopov/clj-nats-async "1.3.0"
  :description "an async client for NATS, wrapping java-nats"
  :url "https://github.com/AlexeyPopov/clj-nats-async"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :dependencies [[io.nats/jnats "1.0"]
                 [manifold "0.1.8"]]

  :profiles {:provided {:dependencies [[org.clojure/clojure "1.9.0"]]}})

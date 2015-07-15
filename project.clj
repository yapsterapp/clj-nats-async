(defproject employeerepublic/clj-nats-async "0.1.0-SNAPSHOT"
  :description "an async client for NATS, wrapping java-nats"
  :url ""
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[com.github.cloudfoundry-community/nats-client "0.6.3"]
                 [manifold "0.1.1-alpha2"]]

  :profiles {:provided {:dependencies [[org.clojure/clojure "1.7.0"]]}}
  )

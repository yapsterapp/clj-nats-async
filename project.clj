(defproject clj-nats-async "0.4.1"
  :description "an async client for NATS, wrapping java-nats"
  :url "https://github.com/employeerepublic/clj-nats-async"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :dependencies [[com.github.cloudfoundry-community/nats-client "0.6.3"]
                 [manifold "0.1.1-alpha3"]]

  :profiles {:provided {:dependencies [[org.clojure/clojure "1.7.0"]]}})

(defproject clj-nats-async "0.4.2"
  :description "an async client for NATS, wrapping java-nats"
  :url "https://github.com/employeerepublic/clj-nats-async"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :dependencies [[employeerepublic/jnats "0.4.1-2"]
                 [manifold "0.1.5"]]

  :profiles {:provided {:dependencies [[org.clojure/clojure "1.8.0"]]}})

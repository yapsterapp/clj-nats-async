(defproject clj-nats-async "1.3.0-TESTREL-20180625-2"
  :description "an async client for NATS, wrapping java-nats"
  :url "https://github.com/employeerepublic/clj-nats-async"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :dependencies [[employeerepublic/jnats "1.1.0-TESTREL-20180625-2"]
                 [manifold "0.1.8"]]

  :profiles {:provided {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :repl {:dependencies [[org.clojure/tools.nrepl "0.2.13"]]}})

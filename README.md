# clj-nats-async

an async clojure NATS client, wrapping java-nats and exposing manifold streams
on subscriptions

## Usage

    (require '[clj-nats-async.core :as nats])

    (def n (nats/create-nats "nats://localhost:4222"))

    (def s (nats/subscribe n "foo"))
    (def msg (manifold.stream/take! (:stream s)))

    (nats/publish n "foo" "boo")

    (nats/msg-body @msg)


## License

Copyright 2015 Employee Republic Limited

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this software except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

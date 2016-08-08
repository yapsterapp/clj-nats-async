# clj-nats-async

an async clojure NATS client, wrapping jnats

creates Manifold streams on a NATS subject for :

- publish only (a sink-only stream)
- subscribe only (a source-only stream)
- pubsub (a source+sink stream)

## Usage

    (require '[clj-nats-async.core :as nats])

    (def n (nats/create-nats "nats://localhost:4222"))

    (def s (nats/pubsub n "foo"))

    (manifold.stream/put! s "boo")

    (def msg (manifold.stream/take! s))
    (nats/msg-body @msg) ;; => "boo"

    (.close s)

## License

Copyright 2016 Employee Republic Limited

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this software except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

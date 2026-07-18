(ns shionome.test-runner
  (:require [clojure.test :as test]
            [shionome.cells.test-membrane-flow] [shionome.cells.test-state-machine]
            [shionome.cells.regime-observer.test-state-machine]
            [shionome.methods.test-analyze] [shionome.methods.test-autorun]
            [shionome.methods.test-charter-invariants] [shionome.methods.test-consistency]
            [shionome.methods.test-edn] [shionome.methods.test-export]
            [shionome.methods.test-grounding]
            [shionome.methods.test-ingest] [shionome.methods.test-kotoba]
            [shionome.methods.test-lexicons] [shionome.methods.test-registry]
            [shionome.methods.test-social] [shionome.methods.test-sources]
            [shionome.methods.test-weave]))
(def suites '[shionome.cells.test-membrane-flow shionome.cells.test-state-machine
 shionome.cells.regime-observer.test-state-machine shionome.methods.test-analyze
 shionome.methods.test-autorun shionome.methods.test-charter-invariants
 shionome.methods.test-consistency shionome.methods.test-edn shionome.methods.test-export
 shionome.methods.test-grounding shionome.methods.test-ingest
 shionome.methods.test-kotoba shionome.methods.test-lexicons shionome.methods.test-registry
 shionome.methods.test-social shionome.methods.test-sources shionome.methods.test-weave])
(defn -main [& _] (let [r (apply test/run-tests suites)]
 (when-not (zero? (+ (:fail r) (:error r))) (throw (ex-info "shionome tests failed" r)))))

(ns test-connection-lib.core-test
  (:require [clojure.test :refer :all]
            [test-connection-lib.core :refer :all]))

(deftest console-fun-test
  (testing "FIXME, I fail."
    (is (= (with-out-str (test-connection-lib.core/console-fun)) "Hello from console-fun!\r\n"))))

(ns clodown.test.core
  (:use [clodown.core])
  (:use [clojure.test]))

(deftest converts-simple-text
  (is (= "<p>Foo</p>" (md "Foo")) "Simple conversion test."))



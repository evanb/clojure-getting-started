(ns clojure-getting-started.web-test
  (:require [clojure.test :refer :all]
            [clojure-getting-started.web :refer :all]))

(deftest first-test
  (is (= 4 (+ 2 2))))

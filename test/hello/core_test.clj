(ns hello.core-test
    (:require [clojure.test :as t]
      [hello.core :as sut])) ; sut is a common alias for "system under test"

(t/deftest greet-test
           (t/testing "The greet function"
                      (t/is (= "Hello, Clojure!" (sut/greet "Clojure")) "returns a personalized greeting.")
                      (t/is (not= "Hello, World!" (sut/greet "Clojure")) "does not return the wrong name.")))
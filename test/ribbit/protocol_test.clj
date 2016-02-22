(ns ribbit.protocol-test
  (:require [clojure.test :refer :all]
            [ribbit.util :refer :all]
            [ribbit.protocol :refer :all]))

(def resources
  {:test-tip   "valid-tip.der"
   :test-croak "valid-croak.der"
   :junk       "junk.der"})

;; These are totally all the tests I need

(deftest test-decode-tip
  (testing "Decoding a single tip"
    (let [result (with-resource (:test-tip resources) decode-tip-from-stream)
          expected {:number 1
                    :tip    "IN CASE OF EMERGENCY, PULL DOWN ON FROG AND BREATHE NORMALLY. OXYGEN IS FLOWING EVEN THOUGH FROG MAY NOT APPEAR TO INFLATE."}]
      (is (= result expected)))))

(deftest test-decode-croak
  (testing "Decoding a croak"
    (let [result (with-resource (:test-croak resources) decode-croak-from-stream)]
      (is (not (nil? result))))))

(deftest test-nil-tip-for-junk-tip
  (testing "A nil tip is returned for junk input"
    (let [result (with-resource (:junk resources) decode-tip-from-stream)]
      (is (nil? result)))))

(deftest test-nil-croak-for-junk-tip
  (testing "A nil croak is returned for junk input"
    (let [result (with-resource (:junk resources) decode-croak-from-stream)]
      (is (nil? result)))))
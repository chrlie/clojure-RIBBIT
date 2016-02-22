(ns ribbit.util
  (:require [clojure.java.io :as io]))


(defn- load-resource
  "Load a JAR resource"
  [name]
  (let [path (io/resource name)]
    (io/input-stream path)))

;; I DON'T KNOW HOW TO MACRO OTHERWISE THIS WOULD BE NICE

(defn with-resource
  "Call a function that expects a stream with a resource path instead"
  [path stream-func]
  (with-open
    [stream (load-resource path)]
    (stream-func stream)))
(ns example.core
  (:gen-class)
  (:require [com.stuartsierra.component :as component]))

(defrecord Toy []
  component/Lifecycle
  (start [component]
    (println "test")
    component)
  (stop [component]
    component))


(defn -main
  []
  (component/start-system (component/system-map :toy (Toy.))))

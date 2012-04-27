(ns clodown.core
  (:import (org.pegdown PegDownProcessor)))

(def
  ^{:private true}
  processor
  "Implementation detail."
  (PegDownProcessor.))

(defn md
  "Takes a string of MarkDown text and returns a string of HTML."
  [s]
  (.markdownToHtml processor s))

;; Concurrency safe markdown processing

(def
  ^{:private true}
  processor-agent
  (agent (PegDownProcessor.)))

(defn- md-handler [pdp s promise]
  (deliver promise (md s))
  pdp)

(defn mdp
  "Concurrency safe MD access point"
  [s]
  (let [p (promise)]
    (send processor-agent md-handler s p)
    @p))
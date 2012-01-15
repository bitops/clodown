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

(set-env!
 :source-paths   #{"src"}
 :resource-paths #{"resources"}
 :dependencies '[[com.stuartsierra/component "0.2.3"]
                 [org.clojure/clojure   "1.7.0"]])

(deftask build
  "Builds an uberjar of this project that can be run with java -jar"
  []
  (comp
   (aot :namespace '#{example.core})
   (pom :project 'example
        :version "1.0.0")
   (uber)
   (jar :main 'example.core)))

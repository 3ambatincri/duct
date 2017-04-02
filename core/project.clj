(defproject duct/core "0.9.0-SNAPSHOT"
  :description "Support library for the Duct template."
  :url "https://github.com/weavejester/duct"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [integrant "0.3.3"]
                 [meta-merge "1.0.0"]]
  :profiles
  {:repl {:dependencies [[eftest "0.1.4"]]}})

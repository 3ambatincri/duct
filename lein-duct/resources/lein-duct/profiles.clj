{:default
 [:base :plugin.lein-duct/base :system :user :provided :dev]

 :base
 {:target-path    "target/%s"
  :resource-paths ^:replace ["resources" "%s/resources"]
  :prep-tasks     ["javac" "compile" ["duct" "compile"]]}

 :dev
 {:source-paths   ["dev/src"]
  :resource-paths ["dev/resources"]
  :repl-options   {:init-ns user}}

 :repl
 ^:repl {:prep-tasks ^:replace ["javac" "compile"]}

 :uberjar
 {:target-path    "target/%s"
  :resource-paths ["%s/resources"]
  :prep-tasks     ["javac" "compile" ["duct" "compile"]]
  :aot            :all}

 :cljs
 {:repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}}
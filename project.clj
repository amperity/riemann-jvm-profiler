(defproject amperity/riemann-jvm-profiler "0.1.0"
  :description "Distributed JVM profiling for Riemann."
  :url "http://github.com/riemann/riemann-jvm-profiler"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies
  [[org.clojure/clojure "1.9.0"]
   [org.clojure/tools.logging "0.4.0"]
   [cheshire "5.8.0"]
   [interval-metrics "1.0.0"]
   [clj-radix "0.1.0"]
   [http-kit "2.2.0"]
   [clj-time "0.14.2"]]

  :java-source-paths ["src/riemann"]
  :manifest {"premain-Class" "riemann.jvm_profiler.Agent"})

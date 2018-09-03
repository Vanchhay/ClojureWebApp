(ns user
  (:require [plusapp.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [plusapp.figwheel :refer [start-fw stop-fw cljs]]
            [plusapp.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'plusapp.core/repl-server))

(defn stop []
  (mount/stop-except #'plusapp.core/repl-server))

(defn restart []
  (stop)
  (start))



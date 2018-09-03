(ns plusapp.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [plusapp.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[plusapp started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[plusapp has shut down successfully]=-"))
   :middleware wrap-dev})

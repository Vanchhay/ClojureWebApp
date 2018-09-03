(ns plusapp.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[plusapp started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[plusapp has shut down successfully]=-"))
   :middleware identity})

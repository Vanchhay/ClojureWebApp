(ns plusapp.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [plusapp.core-test]))

(doo-tests 'plusapp.core-test)


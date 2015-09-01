(ns dom-tools.event-sim-spec
  (:require-macros [quiescent-model.component :as c]
                   [cljs.test :refer (is deftest run-tests)])
  (:require [dom-tools.query :as q]
            [cljs.test :as t]
            [goog.dom :as gd]
            [quiescent.dom :as d]
            [quiescent.core]
            [quiescent-model.state :as state]
            [dom-tools.test-utils :as tu]))


; This is for stateful component testing... later...


(deftest anything
  (is true))

;(def root-context (state/root-scope (atom {:button
;                                           {:data-count 0}})))
;
;(c/defscomponent Button
;                 "A button"
;                 [data context]
;
;                 (let [op (state/op-builder context)
;                       plus-one (op #(inc %))]
;                   (d/button {:onClick    (plus-one (:data-count data))
;                              :className  "test-button"
;                              :data-count (:data-count data)})))
;
;(cljs.pprint/pprint "a random string")
;
;
;(tu/click (q/find-element :class "test-button" (Button :button root-context)))

; Call our button with:
;
;(q/dom-frag (Button :button root-context))


















;(spec "blag"
;      (provided "async stuff does blah"
;                (js/setTimeout (capture f) 200) => (async 200 (f [1 2 3]))
;                (ajax/get (capture url) (capture gc) anything) => (async 150 (gc [4 5 6]))
;
;        (let [state (my-root)                               ; set to 6/11/2014
;              rendering (fn [] (Calendar :cal state))
;              ]
;          (behavior ""
;                    (click-button "Next Month" (rendering)) => anything
;                    (-> @state :cal :month) => 7
;                    (rendering) => (contains-string ".label" "7/1/2014")
;                    clock-ticks => 201
;                    (-> @state :cal :data) => [1 2 3]
;                    clock-ticks => 150
;                    (-> @state :cal :ajax-data) => [4 5 6]
;
;                    )
;
;          )))

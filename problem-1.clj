;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
;; The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.
;;
;; # notes #
;; List all natural nnumbers below ten that are multiples of three or five
;; returns 3,5,6 and 9. The sum of the multiples is 23.
;; For all n<10 ( (if n/3 is integer)==true , print( str( n + " " )))
;; ( n (if n/3 isInteger) conj(multiples-list)<-no lol
;;(if (zero? 
;;(mod n 3)
;;(mod n 5) 
;; switch case is performant !
;;     (case 
(ns Problem 1)
(println "Hello World!")

(def problem-001 "If we list all the natural numbers below 10 that are multiples of 3 or 5 we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.")

(defn ^number -
  ([x] (cljs.core/- x))
  ([x y] (cljs.core/- x y))
  ([x y & more] (reduce - (cljs.core/- x y) more)))

(defn is-multiple
  [n]
  (cond (- (rem n 3) 0) true
        (- (rem n 5) 0) true
        :else false))

(apply + (filter is-multiple (range 1 1000)))


for each 

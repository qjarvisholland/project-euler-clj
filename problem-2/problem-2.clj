(defn fib [n]
  (cond
      (= n 0) 0
      (= n 1) 1
        :else (+ (fib (- n 1)) (fib (- n 2)))))


(defn fib-add [[a b]] [b (+ a b)])
(def fib-seq(map last (iterate fib-add [0 1])))
(take 10 fib-seq)


(defn get-fib [n] 
  (loop 
    [ x [0 1]] 
    (if (< (count x) n) 
      (recur (conj x (+ (last x) (nth x (- (count x) 2))))) x)))

(comment
 
 (apply + (get-fib 30))
 gives sum of fib's up to index 30, but what index is below 4000000 ??
 



(defn fib-add [[a b]] [b (+ a b)])

(def fib-seq (map last (iterate fib-add [1 1]))) ;; All fibonacci numbers
(def fibs-under-4m (take-while (fn [n] (< n 4000000)) fib-seq))
(def even-fibs-under-4m (filter even? fibs-under-4m))
;; 
;;(apply + even-fibs-under-4m)
;;(reduce + even-fibs-under-4m)
)

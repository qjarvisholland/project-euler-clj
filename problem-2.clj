(defn fib [n]
  (cond
      (= n 0) 0
      (= n 1) 1
        :else (+ (fib (- n 1)) (fib (- n 2)))))


(defn get-fib [n] 
  (loop 
    [ x [0 1]] 
    (if (< (count x) n) 
      (recur (conj x (+ (last x) (nth x (- (count x) 2))))) x)))

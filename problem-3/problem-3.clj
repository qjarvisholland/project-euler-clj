
(defn prime-factors (n)
	
	(
	(let c 2)
	(while (n > 1 (
		(if (n % c == 0) (print (string c " "))
		n /= c))
	)
)


;; prime-factors(n)

;; achieves 0(logn) for composite. else 0(n)

;; if prime factors are in a collection, use "last" to pick off the largest num

;; (def test-number 600851475143)
;; (last (prime-factors(test-number)))

;; (loop [x 0]
;;	(recur (+1 x)))
;; 


(comment


  (loop [x 0]
    (print x)
    (recur (+ 1 x)))

  ;; ===

  ((fn [x]
     (print x)
     (recur (+ 1 x))) 0)


  ;; ===
  ((fn count-forever [x]
     (print x)
     (count-forever (+ 1 x))) 0)


  ((fn count-some [x max]
     (if (< x max)
       (count-some (+ x 1) max)
       (do
         (println x)
         (println "done!")))) 0 1000000)


  ((fn count-some [x max]
     (if (< x max)
       (do
         (println
           (recur (+ x 1) max)))
       (do
         (println x)
         (println "done!")))) 0 10)

)
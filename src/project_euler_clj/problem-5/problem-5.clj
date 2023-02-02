(defn eligible []
      (for
        [n]
        (if
          (can-be-divided-by (range 1 20) (min (n))))
        (print n)
        (inc n)))                                           ;; doesnt work


(def a (atom 10))
;; #'user/a

(while (pos? @a)
       (println @a)
       (swap! a dec))

(def n (atom 1))

(while (whilecondition)
       (print @n)
       (swap! n inc))

(def n (atom 1))
(first
  (if (zero? (rem (range 1 20) @n))
         @n
         (swap! n inc))
  )

(if (zero? (rem (range 1 20) @z))
          (swap! z inc)
          (print @z))
(while (zero? (rem @z (range 1 20)))
       (print @z)
       (swap! z inc))





(defn solving []
   (def z (atom 1))
   (while (not= (rem @z (range 1 20)))
      (do
         (println @z)
         (swap! z inc))))
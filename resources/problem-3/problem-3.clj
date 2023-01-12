;; PROBLEM STATEMENT
;; =================
;; The prime factors of 13195 are 5, 7, 13 and 29.
;; What is the largest prime factor of the number 600851475143 ?



(defn factors-of [n] (filter #(zero? (rem n %)) (range 2 (+ 1 (/ n 2)))))

(defn is-prime? [n] (if (< 1 n) (empty? (filter #(= 0 (mod n %)) (range 2 n))) false))


(comment
;; user=> (map is-prime? (factors-of 100))
;; (true false true false false false false)
;; (filter is-prime? (factors-of 100))
;; (2 2 5 5)
;; how can I calculate these with a LIFO ? last in = highest prime factor, should be first out
;; memoization
;; vector collections are last in first out stacks
;; if coll = []
;; (peek coll) is more efficient than (last coll)


  (require '[clojure.core.memoize :as memo])

  (> (* i i) n)
  (< n (* i i)))

;; Define a better recursive function to check if a number is prime

(defn prime? [n]
  (if (= n 1)
    false
    (loop [i 2]
      (if (< (/ n 2) i)
        true
        (if (zero? (mod n i))
          false
          (recur (inc i)))))))

;; Using memoization here to keep track of already computed factors
(def prime-factors
  (memoize (fn [n]
             (if (prime? n)
               [n]
               (let [f (first (filter
                                (fn [x] (and (prime? x) (zero? (mod n x))))
                                (range 2 n)))]
                 (concat [f] (prime-factors (quot n f))))))))




(defn factors
  "Return the factors of a number"
  [n]
  (filter
    (fn [x] (zero? (mod n x)))
    (range 2 n)))


(def prime-factors-l
  (memoize (fn [n]
             (if (prime? n)
               [n]
               (let [smallest-prime (first (filter prime? (factors n)))
                     next-n (quot n smallest-prime)]
                 (concat [smallest-prime] (prime-factors-l next-n)))))))


(defn prime-factors-l
  [n]
  (if (prime? n)
    [n]
    (let [smallest-prime (first (filter prime? (factors n)))
          next-n (quot n smallest-prime)]
      (concat [smallest-prime] (prime-factors-l next-n)))))



(comment

  (def n 187)
  (def n 600851)
  (def n 600851475)
  (def n 600851475143)

  (time (prime-factors-l 600851475143))

  (time
    (apply max (prime-factors-l-nm 600851475143)))


  (reduce max (filter prime? (factors 600851475143)))

  (time
    (first (filter prime? (factors-r n))))

  (filter
    (fn [x] (and true #_(prime? x) (zero? (mod n x))))
    (range 2 n))

  (filter
   (fn [x] (and (prime? x) (zero? (mod n x))))
    (range 2 n))

  )






;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; Do the algorithm "by hand"

(comment

  (def n 600851475143)

  (defn smallest-prime-factor
    "Given a number, lazily find its smallest prime factor,"
    [n]
    (first (filter prime? (factors n))))


  (smallest-prime-factor 600851475143) ;; 71
  (/ 600851475143 71) ;; 8462696833

  (smallest-prime-factor 8462696833) ;; 839
  (/ 8462696833 839) ;; 10086647

  (smallest-prime-factor 10086647) ;; 1471
  (/ 10086647 1471) ;; 6857

  (smallest-prime-factor 6857) ;; 6857 is prime



  )













;; solution -
;; project-euler-clj.core=> (prime-factors 600851475143)


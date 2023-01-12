;; PROBLEM STATEMENT
;; =================
;; The prime factors of 13195 are 5, 7, 13 and 29.
;; What is the largest prime factor of the number 600851475143 ?



(defn factors-of [n] (filter #(zero? (rem n %))(range 2 (+ 1 (/ n 2)))))
`

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

;; Define a better recursive function to check if a number is prime
(defn prime? [n]
  (if (= n 1)
    false
    (loop [i 2]
      (if (> (* i i) n)
        true
        (if (zero? (mod n i))
          false
          (recur (inc i)))))))
          
;; Using memoization here to keep track of already computed factors
(def prime-factors (memoize (fn [n]
  (if (prime? n)
    [n]
    (let [f (first (filter (fn [x] (and (prime? x) (zero? (mod n x)))) (range 2 n)))]
      (concat [f] (prime-factors (quot n f))))))))

;; solution -
;; project-euler-clj.core=> (prime-factors 600851475143)


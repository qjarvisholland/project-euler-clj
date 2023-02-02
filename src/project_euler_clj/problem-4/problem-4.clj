;; A palindromic number reads the same both ways. 
;; The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
;; Find the largest palindrome made from the product of two 3-digit numbers.

(def n1 65432123456)
(reverse (str n1))
(seq (str n1))
(defn is-palindrome [n1]
      (if
        (= (reverse (str n1))
           (seq (str n1)))
        (str n1)))

;; This gives me "too few args to if"
;;(defn is-palindrome [n1]
;;      (if
;;        (= (reverse (str n1))
;;           (seq (str n1)))))

;; pseudocode section
;;(is-symmetric (= (seq (str n)) (reverse (str n))) true false)
;;(is-palindrome (is-symmetric n) true false)
;;(three-digit-nums (and (> n 99) (< n 1000)) true false) ;just use range

(filter is-palindrome (range 99 1000))

(last (filter is-palindrome (range 99 1000)))

(map vector '(1 2 3 4 5) '(01 02 03 04 05))
(map vector (range 1 5) (range 1 5))

;; pseudocode
;; (tuple-products (for each x (for each y (* x y))))
(map (fn [a b] (* a b)) (range 10) (range 10))
;;(def digits [1 2 3])

(defn tuple-products
[digits]
	(for [x1 digits
     	 	x2 digits]
     		(* x1 x2)))

(last (filter is-palindrome (tuple-products (range 99 1000))))
;; => 580085

(last (filter is-palindrome (tuple-products (range 1000 99 -1)))) ;; faster
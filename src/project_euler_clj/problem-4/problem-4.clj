;; A palindromic number reads the same both ways. 
;; The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
;; Find the largest palindrome made from the product of two 3-digit numbers.
;;


(def n1 65432123456)
(reverse (str n1))
(seq (str n1))
(defn is-palindrome [n1] (if 
                           (= 
                            (reverse 
                             (str n1)) 
                            (seq (str n1)))(str n1)))
;; pseudocode section
;;
;;(is-symmetric (= (seq (str n)) (reverse (str n))) true false)
;;(is-palindrome (is-symmetric n) true false)
;;(three-digit-nums (and (> n 99) (< n 1000)) true false) ;just use range

(filter is-palindrome (range 99 1000))

(last (filter is-palindrome (range 99 1000)))

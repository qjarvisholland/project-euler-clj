;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
;; The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.
;;
;; # notes #
;; List all natural nnumbers below ten that are multiples of three or five
;; returns 3,5,6 and 9. The sum of the multiples is 23.
;; For all n<10 ( (if n/3 is integer)==true , print( str( n + " " )))
;;
;;
;;
;;
;;
;;
;; ( n (if n/3 isInteger) conj(multiples-list)
(if 
(mod n 3)
(mod n 5) 

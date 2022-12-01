
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
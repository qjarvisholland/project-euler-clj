
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


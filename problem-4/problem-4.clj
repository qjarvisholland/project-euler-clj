
(def n1 65432123456)
(reverse (str n1))
(seq (str n1))



(defn is-palindrome [n1]
      (if (= (reverse (str n1)) (seq (str n1)))
        (println (str n1))))





(defn is-palindrome [n1] (if (= (reverse (str n1)) (seq (str n1))) (println (str  (str n1) " is a palindrome" ))))
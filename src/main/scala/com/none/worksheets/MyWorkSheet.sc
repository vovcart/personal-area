val n=10
val i=7

(180/4)



def circleOfNumbers(n: Int, firstNumber: Int): Int = {
  if(firstNumber==n/2) 0 else
  if(firstNumber<n/2) firstNumber+n/2 else firstNumber-n/2
}

circleOfNumbers(10,7)


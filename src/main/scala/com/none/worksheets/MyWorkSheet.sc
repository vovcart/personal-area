for(i <-0 to 10)yield if(i<2) i


def circleOfNumbers(n: Int, firstNumber: Int): Int = {
  if(firstNumber==n/2) 0 else
  if(firstNumber<n/2) firstNumber+n/2 else firstNumber-n/2
}

circleOfNumbers(10,7)


package com.none.core.my_solution.cores_1_10

object Core6 {
  def circleOfNumbers(n: Int, firstNumber: Int): Int = {
    if(firstNumber<n/2) firstNumber+n/2
    else if(firstNumber==n/2) 0
    else firstNumber-n/2
  }
}

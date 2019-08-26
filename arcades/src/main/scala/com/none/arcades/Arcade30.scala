package com.none.arcades

object Arcade30 {

  def circleOfNumbers(n: Int, firstNumber: Int): Int = {
    if (firstNumber == n / 2) 0
    else if (firstNumber < n / 2) firstNumber + n / 2
    else firstNumber - n / 2
  }

}

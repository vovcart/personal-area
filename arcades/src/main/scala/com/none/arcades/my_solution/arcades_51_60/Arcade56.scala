package com.none.arcades.my_solution.arcades_51_60

object Arcade56 {

  def digitsProduct(product: Int): Int = {
    if (product == 0) 10
    else if (product == 1) 1
    else if (hadDivisors(product)) getDigits(product, "")
    else -1
  }

  def hadDivisors(input: Int): Boolean = {
    (2 to 9).count(input % _ == 0) > 0
  }

  def getDigits(input: Int, acumulator: String): Int = {
    if (input == 1) acumulator.toInt
    else if (!hadDivisors(input)) -1
    else {
      val maxDivisor = getMaxDigitDivisor(input)
      getDigits(input / maxDivisor, maxDivisor.toString + acumulator)
    }
  }

  def getMaxDigitDivisor(input: Int): Int = {
    (2 to 9).filter(input % _ == 0).max
  }

}

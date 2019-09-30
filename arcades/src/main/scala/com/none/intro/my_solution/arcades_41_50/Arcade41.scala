package com.none.intro.my_solution.arcades_41_50

object Arcade41 {

  def digitDegree(n: Int): Int = {
    getOperationNumber(n, 0)
  }

  def getOperationNumber(number: Int, operations: Int): Int = {
    val stringNumber = number.toString
    if (stringNumber.length == 1) {
      operations
    } else {
      getOperationNumber((stringNumber.map(i => i.getNumericValue).sum), operations + 1)
    }
  }
}

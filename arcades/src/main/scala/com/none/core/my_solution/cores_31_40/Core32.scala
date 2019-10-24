package com.none.core.my_solution.cores_31_40

object Core32 {
  def rounders(n: Int): Int = {
    val s = n.toString
    (s.head.getNumericValue + s.tail.foldRight(0)((digit, acumulator) => {
      if (acumulator + digit.getNumericValue < 5) 0
      else 1
    })) * Math.pow(10, s.length - 1).toInt
  }
}

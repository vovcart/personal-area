package com.none.core.my_solution.cores_11_20

object Core19 {
  def rangeBitCount(a: Int, b: Int): Int = {
    (a to b).map(_.toBinaryString).map(_.count(_.getNumericValue == 1)).sum
  }
}

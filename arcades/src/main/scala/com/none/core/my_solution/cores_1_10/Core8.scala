package com.none.core.my_solution.cores_1_10

object Core8 {

  def phoneCall(min1: Int, min2_10: Int, min11: Int, s: Int): Int = {
    s match {
      case a if (a < min1) => 0
      case b if (b==min1) => 1
      case c if (c <= min1 + min2_10 * 9) => 1 + (c - min1)/min2_10
      case d => 1 + 9 + (d - min1 - min2_10*9) / min11
    }
  }
}

package com.none.core.net_solution.cores_11_20

object Core19 {
  //Solution nr-1
  def rangeBitCount(a: Int, b: Int): Int = {
    (a to b).map(Integer.bitCount).sum
  }
}

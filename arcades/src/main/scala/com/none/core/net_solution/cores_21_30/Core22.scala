package com.none.core.net_solution.cores_21_30

object Core22 {
  //Solution nr-1
  def swapAdjacentBits(n: Int): Int = {
    return ((n & 0x55555555) << 1) | ((n & 0xaaaaaaaa) >> 1)
  }

}

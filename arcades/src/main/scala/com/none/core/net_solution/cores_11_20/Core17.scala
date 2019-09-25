package com.none.core.net_solution.cores_11_20

object Core17 {
  //solution nr-1
  def killKthBit1(n: Int, k: Int): Int = {
    return n & ~(1 << (k - 1))
  }

}

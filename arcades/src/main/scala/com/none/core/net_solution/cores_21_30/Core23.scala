package com.none.core.net_solution.cores_21_30

object Core23 {
  def differentRightmostBit(n: Int, m: Int): Int = {
    return (n ^ m) & (~(n ^ m) + 1)
  }
}

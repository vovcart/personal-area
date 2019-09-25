package com.none.core.my_solution.cores_21_30

object Core23 {

  def differentRightmostBit(n: Int, m: Int): Int = {
    return Math.pow(2, getPower(n, m)).toInt
  }

  def getPower(n: Int, m: Int): Int = {
    val z = "%32d".format(BigInt(n.toBinaryString)).reverse
    val x = "%32d".format(BigInt(m.toBinaryString)).reverse
    z.indices.indexWhere(i => z(i) != x(i))
  }

}

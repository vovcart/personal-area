package com.none.core.net_solution.cores_21_30

object Core21 {
  //Solution nr-1
  def secondRightmostZeroBit1(n: Int): Int = {
    return Math.pow(2, n.toBinaryString.reverse.zipWithIndex.filter(_._1 == '0').tail.head._2).toInt
  }
}

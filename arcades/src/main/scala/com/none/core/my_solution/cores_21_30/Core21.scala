package com.none.core.my_solution.cores_21_30

object Core21 {
  def secondRightmostZeroBit(n: Int): Int = {
    return getTwoPowerOfSecondRightMostZeroBit(n)
  }

  def getTwoPowerOfSecondRightMostZeroBit(n: Int): Int = {
    val nToBinary = n.toBinaryString.reverse
    Math.pow(2, nToBinary.indexWhere(_.getNumericValue == 0, nToBinary.indexWhere(_.getNumericValue == 0) + 1)).toInt
  }
}

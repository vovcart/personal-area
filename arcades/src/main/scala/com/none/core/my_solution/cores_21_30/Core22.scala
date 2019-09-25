package com.none.core.my_solution.cores_21_30

object Core22 {

  def swapAdjacentBits(n: Int): Int = {
    return getNumberWithSwappedBits(n)
  }

  def getNumberWithSwappedBits(n: Int): Int = {
    val nToBinary = BigInt(n.toBinaryString).formatted("%030d")
    Integer.parseInt((0 until nToBinary.length - 1 by 2)
                       .map(i => "" + nToBinary(i + 1) + nToBinary(i))
                       .foldLeft("")(_ + _), 2)
  }
}

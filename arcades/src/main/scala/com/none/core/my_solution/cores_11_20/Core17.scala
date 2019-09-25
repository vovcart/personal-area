package com.none.core.my_solution.cores_11_20

object Core17 {

  def killKthBit(n: Int, k: Int): Int = {
    return getNumberAfterChangedBitToZero(n, k)
  }

  def getNumberAfterChangedBitToZero(number: Int, bitIndex: Int): Int = {
    val binaryString = number.toBinaryString
    binaryString.indices.foldLeft(0)((acumulator, digit) => {
      if (digit == binaryString.length - 1 - bitIndex) acumulator
      else acumulator + Math.pow(2, binaryString.length - 1 - digit).toInt * binaryString(digit).getNumericValue
    })
  }
}
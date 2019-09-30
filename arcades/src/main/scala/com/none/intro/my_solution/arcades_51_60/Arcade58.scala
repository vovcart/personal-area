package com.none.intro.my_solution.arcades_51_60

object Arcade58 {
  def messageFromBinaryCode(code: String): String = {
    (0 until code.length by 8)
      .map(index => getCharEquivalent(code, index))
      .foldLeft("")(_ + _)
  }

  def getCharEquivalent(binaryValue: String, startIndex: Int): Char = {
    val endIndex = startIndex + 8
    val binarySlice = binaryValue.slice(startIndex, endIndex)
    binarySlice
      .indices
      .flatMap(index => {
        if (binarySlice(index).getNumericValue == 1) Some(Math.pow(2, 7 - index))
        else None
      })
      .sum
      .toChar
  }
}


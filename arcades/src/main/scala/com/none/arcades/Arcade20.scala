package com.none.arcades

object Arcade20 {

  def arrayMaximalAdjacentDifference(inputArray: Array[Int]): Int = {
    (0 until inputArray.length - 1)
      .map(i => (inputArray(i) - inputArray(i + 1)).abs)
      .max
  }

}

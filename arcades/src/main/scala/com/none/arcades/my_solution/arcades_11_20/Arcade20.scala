package com.none.arcades.my_solution.arcades_11_20

object Arcade20 {

  def arrayMaximalAdjacentDifference(inputArray: Array[Int]): Int = {
    (0 until inputArray.length - 1)
      .map(i => (inputArray(i) - inputArray(i + 1)).abs)
      .max
  }

}

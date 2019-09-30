package com.none.intro.my_solution.arcades_31_40

object Arcade37 {
  def arrayMaxConsecutiveSum(inputArray: Array[Int], k: Int): Int = {
    (0 to inputArray.length - k).map(i => inputArray.slice(i, i + k).sum).max
  }
}

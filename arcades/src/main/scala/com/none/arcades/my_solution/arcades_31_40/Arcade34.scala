package com.none.arcades.my_solution.arcades_31_40

object Arcade34 {
  def extractEachKth(inputArray: Array[Int], k: Int): Array[Int] = {
    inputArray.indices.flatMap(i => if ((i + 1) % k == 0) None else Some(inputArray(i))).toArray
  }
}

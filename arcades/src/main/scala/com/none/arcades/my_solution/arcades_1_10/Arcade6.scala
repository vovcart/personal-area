package com.none.arcades.my_solution.arcades_1_10

object Arcade6 {
  def makeArrayConsecutive2(statues: Array[Int]): Int = {
    val range = (statues.min to statues.max).toList
    range.size - statues.size
  }
}

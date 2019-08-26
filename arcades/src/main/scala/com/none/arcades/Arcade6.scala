package com.none.arcades

object Arcade6 {
  def makeArrayConsecutive2(statues: Array[Int]): Int = {
    val range = (statues.min to statues.max).toList
    range.size - statues.size
  }
}

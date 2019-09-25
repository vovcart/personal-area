package com.none.arcades.net_solution.arcades_1_10

object SolvedArcade6 {
  def makeArrayConsecutive2(statues: Array[Int]): Int = {
    statues.max - statues.min - statues.length + 1
  }
}

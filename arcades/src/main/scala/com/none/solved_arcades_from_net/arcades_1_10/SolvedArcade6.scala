package com.none.solved_arcades_from_net.arcades_1_10

object SolvedArcade6 {
  def makeArrayConsecutive2(statues: Array[Int]): Int = {
    statues.max - statues.min - statues.length + 1
  }
}

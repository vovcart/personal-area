package com.none.solved_arcades_from_net

object SolvedArcade6 {
  def makeArrayConsecutive2(statues: Array[Int]): Int = {
    statues.max - statues.min - statues.length + 1
  }
}

package com.none.arcades.net_solution.arcades_31_40

object SolvedArcade39 {
  //Solution nr-1
  def knapsackLight1(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int = {
    val a = Array((0,0), (value1, weight1), (value2, weight2), (value1+value2, weight1+weight2))
    a.filter(_._2 <= maxW).max._1
  }

}

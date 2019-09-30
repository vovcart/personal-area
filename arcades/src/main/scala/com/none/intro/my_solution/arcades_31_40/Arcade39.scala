package com.none.intro.my_solution.arcades_31_40

object Arcade39 {

  def knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int = {

    maxW match {
      case a if (weight1 > maxW && weight2 > maxW) => 0
      case b if (weight1 <= maxW && weight2 > maxW) => value1
      case c if (weight1 > maxW && weight2 <= maxW) => value2
      case d if (weight1 + weight2) <= maxW => value1 + value2
      case _ => Math.max(value1, value2)
    }
  }
}

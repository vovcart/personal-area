package com.none.intro.net_solution.arcades_1_10

object SolvedArcade4 {
  def adjacentElementsProduct(inputArray: Array[Int]): Int = {
    inputArray.sliding(2).map(_.product).max
  }
}

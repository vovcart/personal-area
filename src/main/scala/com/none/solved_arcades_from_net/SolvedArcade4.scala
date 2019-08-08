package com.none.solved_arcades_from_net

object SolvedArcade4 {
  def adjacentElementsProduct(inputArray: Array[Int]): Int = {
    inputArray.sliding(2).map(_.product).max
  }
}

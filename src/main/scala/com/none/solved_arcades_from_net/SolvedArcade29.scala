package com.none.solved_arcades_from_net

object SolvedArcade29 {
  
  def circleOfNumbers(n: Int, firstNumber: Int): Int = {
    (firstNumber + n/2) % n
  }
}

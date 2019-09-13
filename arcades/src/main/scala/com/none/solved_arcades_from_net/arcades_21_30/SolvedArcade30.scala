package com.none.solved_arcades_from_net.arcades_21_30

object SolvedArcade30 {

  def circleOfNumbers(n: Int, firstNumber: Int): Int = {
    (firstNumber + n / 2) % n
  }
}

package com.none.arcades.my_solution.arcades_51_60

object Arcade54 {
  def sumUpNumbers(input: String): Int = {
    "\\d{1,}".r.findAllIn(input).map(_.toInt).sum
  }
}

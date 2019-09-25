package com.none.arcades.my_solution.arcades_31_40

object Arcade35 {
  def firstDigit(inputString: String): Char = {
    inputString.find(_.isDigit).get
  }
}

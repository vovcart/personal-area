package com.none.arcades.arcades_31_40

object Arcade35 {
  def firstDigit(inputString: String): Char = {
    inputString.find(_.isDigit).get
  }
}

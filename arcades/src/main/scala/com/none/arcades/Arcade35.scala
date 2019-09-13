package com.none.arcades

object Arcade35 {
  def firstDigit(inputString: String): Char = {
    inputString.find(_.isDigit).get
  }
}

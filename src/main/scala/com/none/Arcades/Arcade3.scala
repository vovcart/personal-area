package com.none.Arcades

object Arcade3 {
  def checkPalindrome(inputString: String): Boolean = {
    inputString.toStream==inputString.toStream.reverse
  }
}

package com.none.Arcades

object Arcade3 {
  //scala are unele metode standarde
  //se poate de utilizat
  //inputString == inputString.reverse
  def checkPalindrome(inputString: String): Boolean = {
    inputString.toStream==inputString.toStream.reverse
  }
}

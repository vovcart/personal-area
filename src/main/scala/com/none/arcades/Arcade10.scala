package com.none.arcades

object Arcade10 {

  def commonCharacterCount(s1: String, s2: String): Int = {
    numberOfCharacter(s1, s2, 0)
  }

  def numberOfCharacter(s1: String, s2: String, sumOfCharacters: Int): Int = {
    if (s1.isEmpty || s2.isEmpty) {
      if (s1.head == s2.head) {
        numberOfCharacter(s1.tail, s2.tail, sumOfCharacters + 1)
      } else {
        numberOfCharacter(s1.tail, s2.tail, sumOfCharacters)
      }
    } else sumOfCharacters
  }

}

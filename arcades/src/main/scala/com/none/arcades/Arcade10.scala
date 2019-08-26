package com.none.arcades

object Arcade10 {

  def commonCharacterCount(s1: String, s2: String): Int = {
    s1.intersect(s2).length
  }
}

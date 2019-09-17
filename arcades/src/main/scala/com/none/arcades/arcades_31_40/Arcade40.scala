package com.none.arcades.arcades_31_40

object Arcade40 {
  def longestDigitsPrefix(inputString: String): String = {
    "\\d{0,}".r.findFirstIn(inputString).getOrElse("")
  }
}

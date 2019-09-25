package com.none.arcades.my_solution.arcades_51_60

object Arcade52 {

  def longestWord(input: String): String = {
    "[A-Za-z]{0,}".r.findAllIn(input).maxBy(_.length)
  }
}

package com.none.intro.my_solution.arcades_1_10

object Arcade2 {
  def centuryFromYear(year: Int): Int = {
    if (year % 100 != 0) {
      year / 100 + 1
    } else year / 100
  }

}

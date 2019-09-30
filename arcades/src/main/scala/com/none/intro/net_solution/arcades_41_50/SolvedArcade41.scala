package com.none.intro.net_solution.arcades_41_50

object SolvedArcade41 {
  def digitDegree(n: Int): Int = {
    if(n < 10) 0 else digitDegree(n.toString.map(_.asDigit).sum) + 1
  }
}

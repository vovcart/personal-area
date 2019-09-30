package com.none.intro.net_solution.arcades_21_30

object SolvedArcade27 {
  //Solution nr-1
  def variableName(name: String): Boolean = {
    name.matches("^[a-zA-Z_][a-zA-Z0-9_]*$")
  }
}

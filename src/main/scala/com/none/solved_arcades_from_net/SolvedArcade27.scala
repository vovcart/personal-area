package com.none.solved_arcades_from_net

object SolvedArcade27 {
  //Solution nr-1
  def variableName(name: String): Boolean = {
    name.matches("^[a-zA-Z_][a-zA-Z0-9_]*$")
  }
}

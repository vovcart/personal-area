package com.none.arcades.my_solution.arcades_21_30

object Arcade27 {
  
  def variableName(name: String): Boolean = {
    val pattern = "([^a-zA-Z0-9,_])|(^[0-9])".r
    (pattern.findFirstIn(name).isEmpty)
  }
}

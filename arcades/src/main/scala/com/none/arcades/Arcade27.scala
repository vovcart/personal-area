package com.none.arcades

object Arcade27 {
  
  def variableName(name: String): Boolean = {
    val pattern = "([^a-zA-Z0-9,_])|(^[0-9])".r
    (pattern.findFirstIn(name).isEmpty)
  }
}

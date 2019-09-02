package com.none.arcades

object Arcade27 {
  
  def variableName(name: String): Boolean = {
    val pattern = "[^a-zA-Z0-9,_]".r
    val pattern1 = "^[0-9]".r
    (pattern.findFirstIn(name).isEmpty) && (pattern1.findFirstIn(name).isEmpty)
  }
}

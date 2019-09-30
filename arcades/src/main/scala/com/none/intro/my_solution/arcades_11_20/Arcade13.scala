package com.none.intro.my_solution.arcades_11_20

object Arcade13 {
  def reverseInParentheses(inputString: String): String = {
    if (!inputString.contains("(")) {
      inputString
    } else {
      val a = inputString.substring(inputString.lastIndexOf("("))
      val start = inputString.substring(0, inputString.lastIndexOf("("))
      val end = a.substring((a.indexOf(")")) + 1)
      val result = start + a.substring(1, a.indexOf(")")).reverse + end
      reverseInParentheses(result)
    }
  }
}

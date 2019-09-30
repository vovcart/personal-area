package com.none.intro.my_solution.arcades_41_50

object Arcade45 {

  def buildPalindrome(input: String): Any = {
    val limit = input.indices.indexWhere(start => {
      areSlicesEquals(input, start)
    })
    input + input.slice(0, limit).reverse
  }

  def areSlicesEquals(input: String, start: Int): Boolean = {
    val end = input.length
    val reversedInput = input.reverse
    input.slice(start, end) == reversedInput.slice(0, end - start)
  }
}


package com.none.intro.my_solution.arcades_51_60

object Arcade51 {

  def deleteDigit(input: Int): Int = {
    val inputString = input.toString
    inputString.indices.map(i => {
      (inputString.slice(0, i) + inputString.slice(i + 1, inputString.length)).toInt
    }).max
  }
}

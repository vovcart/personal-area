package com.none.intro.my_solution.arcades_21_30

object Arcade25 {

  def arrayReplace(
      inputArray: Array[Int],
      elemToReplace: Int,
      substitutionElem: Int
  ): Array[Int] = {
    val replacedArray: Array[Int] = Array()
    inputArray.indices
      .flatMap(
        f =>
          if (inputArray(f) == elemToReplace) replacedArray :+ substitutionElem
          else replacedArray :+ inputArray(f)
      )
      .toArray
  }
}

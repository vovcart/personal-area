package com.none.arcades

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

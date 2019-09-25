package com.none.arcades.my_solution.arcades_11_20

object Arcade17 {
  def makeAscArray(
      list: Array[Int],
      index: Int,
      current: Int,
      changeNr: Int
  ): Int = {
    if (index != list.length - 1) {
      if (current < list(index + 1)) {
        makeAscArray(list, index + 1, list(index + 1), changeNr)
      } else {
        makeAscArray(
          list,
          index + 1,
          list(index + 1) + (current - list(index + 1)) + 1,
          changeNr + (current - list(index + 1)) + 1
        )
      }
    } else {
      changeNr
    }
  }

  def arrayChange(inputArray: Array[Int]): Int = {
    makeAscArray(inputArray, 0, inputArray(0), 0)
  }
}

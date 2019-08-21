package com.none.arcades

object Arcade18 {
  def palindromeRearranging(inputString: String): Boolean = {
    rearrangedList(inputString, inputString.distinct, 0)
  }

  def rearrangedList(
      list: String,
      distinctList: String,
      sumNonPareStrings: Int
  ): Boolean = {
    val s = list.filter(_ == distinctList.head)
    if (distinctList.isEmpty) {
      sumNonPareStrings < 2
    } else {
      if (s.length % 2 == 0) {
        rearrangedList(list.diff(s), distinctList.tail, sumNonPareStrings)
      } else {
        rearrangedList(list.diff(s), distinctList.tail, sumNonPareStrings + 1)
      }
    }
  }
}

package com.none.intro.my_solution.arcades_41_50

object Arcade43 {

  def isBeautifulString(inputString: String): Boolean = {
    val sortedString = inputString.sorted
    val distinctString = sortedString.distinct
    val countOfChars = distinctString.map(char => sortedString.count(_ == char))

    ((0 until distinctString.length - 1).map(i => {
      if (distinctString.getBytes()(0) - distinctString.getBytes()(1) != (-1)) 1 else 0
    }).sum == 0) && (countOfChars.reverse == countOfChars.sorted)
  }
}

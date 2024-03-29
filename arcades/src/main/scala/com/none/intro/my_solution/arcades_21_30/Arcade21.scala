package com.none.intro.my_solution.arcades_21_30

object Arcade21 {

  def isIPv4Address(inputString: String): Boolean = {
    val b = inputString.split('.')
    b.indices
      .map(
        i =>
          if ((b(i).length < 4) &&
              !b(i).exists(_.isLetter) &&
              !b(i).isEmpty &&
              b.length == 4 &&
              (0 to 255).contains(b(i).toInt)) 0
          else 1
      )
      .sum < 1
  }
}

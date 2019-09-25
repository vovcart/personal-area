package com.none.arcades.my_solution.arcades_41_50

object Arcade49 {


  def lineEncoding(input: String): String = {
    val ranges = getSameElementsLimits(input)
    getReformatedString(ranges, input)
  }

  def getSameElementsLimits(input: String): Seq[Int] = {
    val differencesLimits = (0 until input.length - 1).flatMap(i => {
      if (input(i) != input(i + 1)) Some(i + 1) else None
    })
    Seq(0)
      .union(differencesLimits.union(Seq(input.length - 1)))
  }

  def getReformatedString(ranges: Seq[Int], input: String): String = {
    (0 until ranges.length - 1).foldLeft("")((acumulator, index) => {
      val lowerLimit = ranges(index)
      val upperLimit = ranges(index + 1)
      if (upperLimit - lowerLimit <= 1) acumulator + s"${input(lowerLimit)}"
      else acumulator + s"${upperLimit - lowerLimit}${input(lowerLimit)}"
    })
  }


}

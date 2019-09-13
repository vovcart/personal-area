package com.none.solved_arcades_from_net.arcades_11_20

object SolvedArcade17 {

  //Solution nr-1
  def arrayChange1(inputArray: Array[Int]): Int = {
    var sum = 0
    inputArray.reduceLeft { (a, b) =>
      if (a >= b) {
        sum += a - b + 1; a + 1
      } else b
    }
    sum
  }
  //Solution nr-2
  def arrayChange2(inputArray: Array[Int]): Int = {
    inputArray.size match {
      case 0 => 0
      case 1 => 0
      case _ => {
        if (inputArray(1) <= inputArray(0)) {
          val thisStep = inputArray(0) - inputArray(1) + 1
          inputArray(1) += thisStep
          thisStep + arrayChange2(inputArray.drop(1))
        } else arrayChange2(inputArray.drop(1))
      }
    }
  }

  //Solution nr-3
  def arrayChange3(inputArray: Array[Int]): Int = {
    inputArray
      .map(x => (x, 0))
      .foldLeft((inputArray(0) - 1, 0))(
        (a, b) =>
          (
            b._1 + math.max(0, a._1 - b._1 + 1),
            a._2 + math.max(0, a._1 - b._1 + 1)
          )
      )
      ._2
  }

}

package com.none.core.my_solution.cores_41_50

object Core45 {

  def squareDigitsSequence(a0: Int): Int = {
    Stream
      .from(0)
      .scanLeft((false, Seq(a0)))((n1, _) => {
        val sumOfSquares = n1._2.last.toString.foldLeft(0)((a, b) => a + b.getNumericValue * b.getNumericValue)
        (n1._2.contains(sumOfSquares),n1._2 :+ sumOfSquares)
      }).indexWhere(_._1) + 1
  }
}


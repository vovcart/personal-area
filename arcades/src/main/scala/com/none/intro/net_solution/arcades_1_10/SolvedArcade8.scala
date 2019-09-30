package com.none.intro.net_solution.arcades_1_10

object SolvedArcade8 {
  //Solution nr-1
  def matrixElementsSum1(matrix: Array[Array[Int]]): Int = {
    matrix.transpose.flatMap(_.takeWhile(_ != 0)).sum
  }

  //Solution nr-2
  def matrixElementsSum2(matrix: Array[Array[Int]]): Int = {
    matrix.transpose
      .map(col => col.reduceRight((l, r) => if (l == 0) 0 else l + r))
      .sum
  }

  //Solution nr-3
  def matrixElementsSum3(matrix: Array[Array[Int]]): Int = {
    val rooms = matrix.transpose
    val res = for {
      row <- rooms
      valid = row.takeWhile(_ != 0)
    } yield valid.sum
    res.sum
  }

  //Solution nr-4
  def matrixElementsSum4(matrix: Array[Array[Int]]): Int = {
    (matrix.transpose.toList.flatMap(_ takeWhile (_ > 0))).fold(0)(_ + _)
  }

}

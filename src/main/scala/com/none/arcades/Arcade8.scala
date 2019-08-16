package com.none.arcades

object Arcade8 {
  def matrixElementsSum(matrix: Array[Array[Int]]): Int = {
    sum(matrix, 0, 0, 0)
  }

  def sum(matrix: Array[Array[Int]], i: Int, j: Int, s: Int): Int = {
    if ((i == matrix.length - 1) && (j == matrix(i).length - 1))
      s + matrix(i)(j)
    else if ((matrix(i)(j) == 0) && (j != matrix(i).length - 1))
      sum(matrix, 0, j + 1, s)
    else if ((matrix(i)(j) == 0 && (j == matrix(i).length - 1))) s
    else if (i == matrix.length - 1) sum(matrix, 0, j + 1, s + matrix(i)(j))
    else sum(matrix, i + 1, j, s + matrix(i)(j))
  }

}

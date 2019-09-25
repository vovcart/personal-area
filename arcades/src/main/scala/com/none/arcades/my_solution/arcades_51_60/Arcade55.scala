package com.none.arcades.my_solution.arcades_51_60

object Arcade55 {

  def differentSquares(matrix: Array[Array[Int]]): Int = {
    (0 until matrix.length - 1).flatMap(i => {
      (0 until matrix(i).length - 1).map(j => {
        Seq(matrix(i)(j), matrix(i)(j + 1), matrix(i + 1)(j), matrix(i + 1)(j + 1))
      })
    }).distinct.length
  }
}

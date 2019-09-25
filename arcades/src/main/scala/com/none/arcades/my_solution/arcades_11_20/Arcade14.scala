package com.none.arcades.my_solution.arcades_11_20

object Arcade14 {

  def alternatingSums(a: Array[Int]): Array[Int] = {
    Array(
      (0 until a.length by 2).map(a(_)).sum,
      (1 until a.length by 2).map(a(_)).sum
    )
  }
}

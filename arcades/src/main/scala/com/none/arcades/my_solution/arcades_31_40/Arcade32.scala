package com.none.arcades.my_solution.arcades_31_40

object Arcade32 {
  def absoluteValuesSumMinimization(a: Array[Int]): Int = {
    val sum = a.indices.map(j => a.indices.map(i => (a(i) - a(j)).abs).sum)
    a(sum.indexOf(sum.min))
  }
}

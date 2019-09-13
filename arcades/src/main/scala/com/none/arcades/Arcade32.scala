package com.none.arcades

object Arcade32 {
  def absoluteValuesSumMinimization(a: Array[Int]): Int = {
    val sum = a.indices.map(j => a.indices.map(i => (a(i) - a(j)).abs).sum)
    a(sum.indexOf(sum.min))
  }
}

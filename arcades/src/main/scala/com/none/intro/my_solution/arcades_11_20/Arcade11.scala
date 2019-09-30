package com.none.intro.my_solution.arcades_11_20

object Arcade11 {
  def isLucky(n: Int): Boolean = {
    val l = n.toString
    l.take(l.length / 2).foldLeft(0)(_ + _.getNumericValue) == l
      .drop(l.length / 2)
      .foldLeft(0)(_ + _.getNumericValue)
  }
}

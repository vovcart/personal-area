package com.none.arcades

object Arcade26 {

  def evenDigitsOnly(n: Int): Boolean = {
    val nList = n.toString.toArray
    nList.indices.map(i => if (nList(i) % 2 == 0) 0 else 1).sum == 0
  }
}

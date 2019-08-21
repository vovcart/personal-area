package com.none.arcades

object Arcade16 {

  def areSimilar(a: Array[Int], b: Array[Int]): Boolean = {
    a.diff(b).length + b.diff(a).length < 2 &&
    (0 until a.length).map(i => if (a(i) != b(i)) 1 else 0).sum < 3
  }
}

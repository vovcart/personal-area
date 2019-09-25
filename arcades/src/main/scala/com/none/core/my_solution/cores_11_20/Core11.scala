package com.none.core.my_solution.cores_11_20

object Core11 {
  def extraNumber(a: Int, b: Int, c: Int): Int = {
    if (a == b) c
    else (a :: b :: Nil).diff(c :: Nil).head
  }
}

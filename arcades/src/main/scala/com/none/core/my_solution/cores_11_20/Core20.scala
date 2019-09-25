package com.none.core.my_solution.cores_11_20

object Core20 {

  def mirrorBits(a: Int): Int = {
    Integer.parseInt(a.toBinaryString.reverse, 2)
  }
}

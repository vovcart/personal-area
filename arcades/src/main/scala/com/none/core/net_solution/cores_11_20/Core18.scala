package com.none.core.net_solution.cores_11_20

object Core18 {
  //Solution nr-1
  def arrayPacking1(a: Array[Int]) = a.foldRight(0)(_ + _ * 256)

  //Solution nr-2
  def arrayPacking2(a: Array[Int]): Int = {
    a.reverse.reduceLeft((a1, a2) => {
      (a1 << 8) | a2
    })
  }

}

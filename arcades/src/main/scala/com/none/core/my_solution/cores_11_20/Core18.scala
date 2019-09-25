package com.none.core.my_solution.cores_11_20

object Core18 {
  def arrayPacking(a: Array[Int]): Int = {
    Integer.parseInt(
      a.map(number => "%08d".format(number.toBinaryString.toInt))
       .reverse
       .foldLeft("")(_ + _), 2)
  }
}

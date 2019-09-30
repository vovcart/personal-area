package com.none.core.net_solution.cores_21_30

object Core25 {
  def leastFactorial(n: Int): Int = {
    Stream.from(1)
          .scanLeft(1){(f, i) => f * i }
          .find(_ >= n)
          .getOrElse(0)
  }
}

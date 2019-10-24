package com.none.core.net_solution.cores_31_40

object Core32 {
  def rounders(n: Int): Int = {
    if (n / 10 == 0) n
    else 10 * rounders(n / 10 + (if (n % 10 < 5) 0 else 1))
  }
}

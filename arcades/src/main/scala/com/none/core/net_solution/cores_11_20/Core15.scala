package com.none.core.net_solution.cores_11_20

object Core15 {

  //Solution nr-1
  def willYou1(young: Boolean, beautiful: Boolean, loved: Boolean): Boolean = {
    (young && beautiful) == !loved
  }
}

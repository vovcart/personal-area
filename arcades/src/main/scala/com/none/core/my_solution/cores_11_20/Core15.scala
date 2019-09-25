package com.none.core.my_solution.cores_11_20

object Core15 {
  def willYou(young: Boolean, beautiful: Boolean, loved: Boolean): Boolean = {
    if (!loved && (!young || !beautiful)) false
    else if (loved && young && beautiful) false
    else true
  }
}

//1.condition for false
// young == beautiful loved==beautiful
// young ==false && young!=beautiful
// beautiful ==false && young!=beautiful

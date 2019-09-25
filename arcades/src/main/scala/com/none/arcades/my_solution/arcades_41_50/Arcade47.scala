package com.none.arcades.my_solution.arcades_41_50

object Arcade47 {

  def isMAC48Address(input: String): Boolean = {
    val MAC48AddressFormat = "(([A-F0-9]{2}-){5}([A-F0-9]{2}))".r
    MAC48AddressFormat.pattern.matcher(input: String).matches()
  }
}

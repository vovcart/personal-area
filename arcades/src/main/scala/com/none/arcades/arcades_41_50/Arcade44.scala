package com.none.arcades.arcades_41_50

object Arcade44 {

  def findEmailDomain(address: String): String = {
    address.substring(address.lastIndexOf("@") + 1)
  }
}

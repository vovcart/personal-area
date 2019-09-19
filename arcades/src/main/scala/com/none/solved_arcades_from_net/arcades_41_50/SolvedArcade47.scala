package com.none.solved_arcades_from_net.arcades_41_50

object SolvedArcade47 {

  //Solution nr-1
  val r = {
    val s = "\\p{XDigit}{2}"
    s"$s-$s-$s-$s-$s-$s".r
  }
  val isMAC48Address1 = r.pattern.matcher(_: String).matches()

  //Solution nr-2
  def isMAC48Address2(inputString: String): Boolean = {
    inputString.matches("""([\dA-F]{2}-){5}[\dA-F]{2}""")
  }

  //Solution nr-3
  def isMAC48Address3(inputString: String): Boolean = {
    inputString.matches("^" + "[A-F0-9][A-F0-9]-"*5 + "[A-F0-9][A-F0-9]$")
  }

  //Solution nr-4
  def isMAC48Address(inputString: String): Boolean = {
    val p = "^([0-9A-F]{2}-){5}[0-9A-F]{2}$".r
    p.findFirstIn(inputString).isDefined
  }
}

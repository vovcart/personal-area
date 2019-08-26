package com.none.solved_arcades_from_net

import scala.util.Try

object SolvedArcade21 {

  //Solution nr-1
  def isIPv4Address1(inputString: String): Boolean = {
    val bytes = inputString.split('.')
    bytes.length == 4 && bytes.forall(
      s => !s.isEmpty && s.forall(_.isDigit) && s.toInt <= 255
    )
  }

  //Solution nr-2
  def isIPv4Address2(inputString: String): Boolean = {
    val x = inputString.split('.')
    x.length == 4 && x.forall(
      i =>
        if (i.length <= 3 && i.matches("^\\d+$"))
          i.toInt <= 255 && i.toInt >= 0
        else false
    )
  }
  //Solution nr-3
  def isIPv4Address3(i: String): Boolean = {
    val g = "\\d{1,3}"
    i.matches(s"$g\\.$g\\.$g\\.$g") &&
    i.split('.')
      .map(_.toInt)
      .forall(_ < 256)
  }

  //Solution nr-4
  def isIPv4Address4(inputString: String): Boolean = {
    val arr = inputString.split('.')

    arr.size == 4 &&
    arr
      .map(x => Try(x.toInt).getOrElse(-1))
      .forall(x => x >= 0 && x <= 255)

  }

}

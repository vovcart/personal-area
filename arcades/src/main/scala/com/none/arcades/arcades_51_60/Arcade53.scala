package com.none.arcades.arcades_51_60

object Arcade53 {

  def validTime(time: String): Boolean = {
    val timeToList = time.split(":")
    (0 to 23).contains(timeToList(0).toInt) && (0 until 60).contains(timeToList(1).toInt)
  }
}

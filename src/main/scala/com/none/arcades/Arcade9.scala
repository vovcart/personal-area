package com.none.arcades

object Arcade9 {

  def allLongestStrings(inputArray: Array[String]): Array[String] = {
    val max=inputArray.map(f=>f.length).max
    inputArray.filter(_.length==max)
  }
}

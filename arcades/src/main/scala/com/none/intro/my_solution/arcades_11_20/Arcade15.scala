package com.none.intro.my_solution.arcades_11_20

object Arcade15 {

  def addBorder(picture: Array[String]): Array[String] = {
    formatToBorderList(picture, Array("*" * (picture(0).length + 2)), 0)
  }

  def formatToBorderList(
      picture: Array[String],
      list: Array[String],
      i: Int
  ): Array[String] = {
    val sizeBorder = picture(0).length + 2
    if (i < picture.length) {
      formatToBorderList(picture, list :+ ("*" + picture(i) + "*"), i + 1)
    } else {
      list :+ "*" * sizeBorder
    }
  }
}

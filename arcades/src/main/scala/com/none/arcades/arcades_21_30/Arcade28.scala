package com.none.arcades.arcades_21_30

object Arcade28 {

  def alphabeticShift(inputString: String): String = {
    inputString.foldLeft("")((first, next) => {
      if (next != 'z') (first) + (next.toByte + 1).toChar
      else first + 'a'
    })
  }
}

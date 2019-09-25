package com.none.arcades.my_solution.arcades_21_30

object Arcade28 {

  def alphabeticShift(inputString: String): String = {
    inputString.foldLeft("")((first, next) => {
      if (next != 'z') (first) + (next.toByte + 1).toChar
      else first + 'a'
    })
  }
}

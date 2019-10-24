package com.none.core.my_solution.cores_41_50

object Core47 {
  def comfortableNumbers(l: Int, r: Int): Int = {
    (l to r).foldLeft(0)((acumulator, num) => {
      acumulator + (num + 1 to num + getDigitSum(num)).count(i => {
        (l to r).contains(i) && (i - getDigitSum(i) until i).contains(num)
      })
    })
  }

  def getDigitSum(number:Int):Int={
    number.toString.foldLeft(0)(_+_.getNumericValue)
  }
}

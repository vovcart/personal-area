package com.none.intro.my_solution.arcades_31_40

object Arcade38 {

  def growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int = {
    val a = (desiredHeight - upSpeed) / (upSpeed - downSpeed).ceil
    val days = BigDecimal(a).setScale(0, BigDecimal.RoundingMode.HALF_UP)
    if (days <= 0) 1 else {
      (days + 1).toInt
    }
  }
}

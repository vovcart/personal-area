package com.none.solved_arcades_from_net

object SolvedArcade38 {

  //Solution nr-1
  def growingPlant1(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int = {
    math.max(1, math.ceil((desiredHeight - downSpeed).toDouble / (upSpeed - downSpeed)).toInt)
  }

  //Solution nr-2
  def growingPlant2(u: Int, d: Int, desire: Int): Int = {
    1 + Math.ceil((desire - u).max(0).toDouble / (u - d).toDouble).toInt
  }
}

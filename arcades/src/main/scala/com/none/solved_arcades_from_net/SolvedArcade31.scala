package com.none.solved_arcades_from_net

object SolvedArcade31 {
  
  //Solution nr-1
  def depositProfit1(deposit: Int, rate: Int, threshold: Int): Int = {
    math.ceil(math.log(threshold.toDouble / deposit) / math.log(1.0 + rate.toDouble / 100)).toInt
  }
  
  //Solution nr-2
  def depositProfit2(deposit: Int, rate: Int, threshold: Int): Int = {
    def rec(d: Double): Double = if (d >= threshold) 0 else 1 + rec(d*(100+rate)/100)
    rec(deposit).toInt
  }
}

package com.none.arcades

object Arcade31 {
  
  def depositProfit(deposit: Int, rate: Int, threshold: Int): Int = {
    numberOfYears(deposit, rate, threshold, 0)
  }
  
  def numberOfYears(deposit: Double, rate: Int, threshold: Int, years: Int): Int = {
    deposit match {
      case a if (a >= threshold) => years
      case _ => numberOfYears(deposit * (1 + rate.doubleValue() / 100.doubleValue()),
                              rate,
                              threshold,
                              years + 1)
    }
  }
  
}
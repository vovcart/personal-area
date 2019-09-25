package com.none.core.net_solution.cores_1_10

object Core8 {

  //Solution nr-1
  def phoneCall1(min1: Int, min2_10: Int, min11: Int, S: Int): Int = {
    val minutes = 1 to 60
    val cpm = Seq(min1) ++ Seq.fill(9)(min2_10) ++ Seq.fill(50)(min11)
    val cumulative = for (i <- minutes) yield cpm.take(i).sum
    cumulative.filter(_ <= S).length
  }

  //Solution nr-2
  def phoneCall2(min1: Int, min2_10: Int, min11: Int, S: Int): Int = {
    if(min1>S)0
    else if ((min1+9*min2_10) > S){ (S-min1)/min2_10+1}
    else (S-min1-9*min2_10)/min11 +10
  }

}

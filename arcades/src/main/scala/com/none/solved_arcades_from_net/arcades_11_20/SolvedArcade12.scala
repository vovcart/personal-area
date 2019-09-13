package com.none.solved_arcades_from_net.arcades_11_20

object SolvedArcade12 {

  def sortByHeight(a: Array[Int]): Array[Int] = {
    val sorted = a.filter(_ != -1).sortBy(x => x)
    var c = -1
    a.map(
      h =>
        if (h == -1) -1
        else {
          c += 1; sorted(c)
        }
    )
  }
}

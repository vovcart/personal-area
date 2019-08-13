package com.none.solved_arcades_from_net

object SolvedArcade7 {
//Solution nr-1
  def almostIncreasingSequence1(sequence: Array[Int]): Boolean = {
    (1 until sequence.length).map(i => if (sequence(i-1) < sequence(i)) 0 else 1).sum <= 1 &&
    (2 until sequence.length).map(i => if (sequence(i-2) < sequence(i)) 0 else 1).sum <= 1
  }

  //Solution nr-2
  def almostIncreasingSequence2(s: Array[Int]): Boolean = {
    if (s.length > 2) {
      var x = -1
      for (i <- 1 until s.length) {
        if (s(i-1) >= s(i)) {
          if (x > -1)
            return false
          else
            x = i-1
        }
      }
      if (x > 0 && x < s.length-2 && s(x-1) >= s(x+1) && s(x) >= s(x+2))
        return false
    }
    true
  }

  //Solution nr-3
  def almostIncreasingSequence3(sequence: Array[Int]): Boolean = {
    sequence.sliding(2).map(i => if (i(1) <= i(0)) 1 else 0).sum <= 1 &&
      (sequence, sequence.drop(2)).zipped.map((x,y) => if (y <= x) 1 else 0).sum <= 1
  }

}

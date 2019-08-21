package com.none.solved_arcades_from_net

object SolvedArcade18 {
  //Solution nr-1
  def palindromeRearranging1(inputString: String): Boolean = {
    inputString.groupBy(c => c).count(_._2.length % 2 == 1) < 2
  }

  //Solution nr-2
  def palindromeRearranging2(inputString: String): Boolean = {
    def even(x: Int) = x % 2 == 0

    val x = inputString
      .foldLeft[Map[Char, Int]](Map.empty)(
        (m, c) => m + (c -> (m.getOrElse(c, 0) + 1))
      )
    x.values.forall(even) || x.values.count(x => !even(x)) == 1
  }

  //Solution nr-3
  def palindromeRearranging3(inputString: String): Boolean = {
    val s = inputString.toSet
    val filtered = s.filter(c => inputString.count(_ == c) % 2 != 0)
    if (filtered.isEmpty || filtered.size == 1) true
    else false
  }

  //Solution nr-4
  def palindromeRearranging4(s: String): Boolean = {
    s.groupBy(identity)
      .mapValues(_.length)
      .values
      .count(_ % 2 == 1) < 2
  }

  //Solution nr-5
  def palindromeRearranging(s: String): Boolean = {
    val counter = new collection.mutable.HashMap[Char, Int]()
    for (c <- s) {
      if (!counter.contains(c)) {
        counter(c) = 0
      }
      counter(c) += 1
    }
    counter.values.count(_ % 2 == 1) <= 1
  }

}

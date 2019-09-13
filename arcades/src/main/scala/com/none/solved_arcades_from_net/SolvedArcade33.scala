package com.none.solved_arcades_from_net

object SolvedArcade33 {

  //Solution nr-1
  def stringsRearrangement1(inputArray: Array[String]): Boolean = {
    inputArray.permutations.exists { p =>
      p.sliding(2).forall { s =>
        (s(0) zip s(1)).count(p => p._1 != p._2) == 1
      }
    }
  }

  //Solution nr-2
  def getDist(s1: String, s2: String): Int = {
    s1.zip(s2).count(x => x._1 != x._2)
  }

  def isOK(arr: Array[String]): Boolean = {
    arr.sliding(2).toArray.forall(x => getDist(x(0), x(1)) == 1)
  }

  def stringsRearrangement2(inputArray: Array[String]): Boolean = {
    val perm = inputArray.permutations

    val solutions = for {
      x <- perm
      if (isOK(x))
    } yield x
    solutions.size > 0
  }

  //Solution nr-3
  def stringsRearrangement3(inputArray: Array[String]): Boolean = {

    // Recursive helper function (ends up taking only plausible permutations into account)
    def helper(s: String, arr: Array[String]): Boolean = {
      if (arr.isEmpty) true
      else !arr.distinct.filter(x => s.zip(x).filter(t => (t._1 != t._2)).size == 1).find(x => helper(x, arr diff Vector(x))).isEmpty
    }

    !inputArray.distinct.find(s => helper(s, inputArray diff Vector(s))).isEmpty    // We have to test for each distinct element as a candidate for first element
  }

  //Solution nr-4
  def stringsRearrangement4(inputArray: Array[String]): Boolean = {
    inputArray.permutations.exists{
      p => p.sliding(2).forall{
        s => (s(0) zip s(1)).count(p => p._1 != p._2) == 1
      }
    }
  }

}

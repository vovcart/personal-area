package com.none.arcades.net_solution.arcades_41_50

object SolvedArcade43 {
  //Solution nr-1
  def isBeautifulString1(inputString: String): Boolean = {
    val c = ('a' to 'z').map(c => inputString.count(_ == c)).reverse
    c == c.sorted
  }
  //Solution nr-2
  def isBeautifulString2(inputString: String): Boolean = {
    ('a' to 'z').map(x => inputString.count(_ == x)).sliding(2).forall(x => x(0) >= x(1))
  }
  //Solution nr-3
  def isBeautifulString3(inputString: String): Boolean = {
    val counts = ('a' to 'z').map(c => inputString.filter(_ == c).length)
    counts.zip(counts.tail).forall(t => t._1 >= t._2)
  }

  //Solution nr-4
  def isBeautifulString4(inputString: String): Boolean = {
    val charCount = ('a' to 'z').map(c => inputString.count(_ == c))
    charCount.reverse == charCount.sorted
  }

}

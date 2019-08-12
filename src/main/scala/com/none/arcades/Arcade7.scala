package com.none.arcades

object Arcade7 {

  //Te-ai complicat :D

  def flatten(l: List[_]): List[_] = l.flatMap {
    case l1: List[_] => flatten(l1.filter(_ != None)) //in scala sa eviti utilizarea valorii null
    case otherwise => List(otherwise).filter(_ != None) //aliasul k pentru filter e in plus se poate de utilizat forma aceasta _ != null adica .filter(_!=null).
  }

  def isAscendingList(list: Array[Int], index: Int): Boolean = { //+1 к карме пентру рекурсие )
    if (index != list.size) {
      val listA: List[_] = flatten((list.take(index) :+ list.drop(index + 1).toList).toList)
      val isAscending = (listA == listA.distinct.sortWith(_.toString.toInt < _.toString.toInt)) //ne delai tac .sortWith(_.toString.toInt < _.toString.toInt)
      if (isAscending) true //isAscending e deja boolean nu este necesar de al verifica in IF statement cu o valoare anumita :)
      else isAscendingList(list, index + 1)
    } else false
  }

  def almostIncreasingSequence(sequence: Array[Int]): Boolean = {
    val list: Array[Int] = Array()
    for (i <- 0 to sequence.length - 2) {
      val first = sequence(i)
      val second = sequence(i + 1)
      if (!list.contains(first)) {
        if (first > second) {
          if ((i + 2 != sequence.length - 1) && (first > first + 2)) list :+ first
          else list :+ second
        }
      }
    }
    println(list.length<2)
    list.length < 2
  }

  def main(args: Array[String]): Unit = {
    almostIncreasingSequence(Array(1,4,9,5,8,5))
  }

}

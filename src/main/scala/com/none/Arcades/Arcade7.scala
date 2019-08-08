package com.none.Arcades

object Arcade7 extends App{

  //Te-ai complicat :D

  def flatten(l : List[_]) : List[_] = l.flatMap {
    case l1 : List[_] => flatten(l1.filter(k=>k!=null)) //in scala sa eviti utilizarea valorii null
    case otherwise => List(otherwise).filter(k=>k!=null) //aliasul k pentru filter e in plus se poate de utilizat forma aceasta _ != null adica .filter(_!=null).
  }

  def isAscendingList(list:Array[Int],index:Int): Boolean={ //+1 к карме пентру рекурсие )
    if(index!=list.size){
      val listA:List[_] = flatten((list.take(index):+list.drop(index+1).toList).toList)
      val isAscending = (listA == listA.distinct.sortWith(_.toString.toInt < _.toString.toInt)) //ne delai tac .sortWith(_.toString.toInt < _.toString.toInt)
      if (isAscending == true) true //isAscending e deja boolean nu este necesar de al verifica in IF statement cu o valoare anumita :)
      else isAscendingList(list, index + 1)
    } else false
  }
  def almostIncreasingSequence(sequence: Array[Int]): Boolean = {
    isAscendingList(sequence,0) // procesarea listei mai bine de facut in recursie cu HEAD :: TAIL constructie
  }

}

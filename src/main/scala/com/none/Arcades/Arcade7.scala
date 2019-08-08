package com.none.Arcades

object Arcade7 extends App{

  def flatten(l : List[_]) : List[_] = l.flatMap {
    case l1 : List[_] => flatten(l1.filter(k=>k!=null))
    case otherwise => List(otherwise).filter(k=>k!=null)
  }

  def isAscendingList(list:Array[Int],index:Int): Boolean={
    if(index!=list.size){
      val listA:List[_] = flatten((list.take(index):+list.drop(index+1).toList).toList)
      val isAscending = (listA == listA.distinct.sortWith(_.toString.toInt < _.toString.toInt))
      if (isAscending == true) true
      else isAscendingList(list, index + 1)
    } else false
  }
  def almostIncreasingSequence(sequence: Array[Int]): Boolean = {
    isAscendingList(sequence,0)
  }

}

package com.none.Arcades

object Arcade7 extends App{

  def flatten(l : List[_]) : List[_] = l.flatMap {
    case l1 : List[_] => flatten(l1.filter(k=>k!=null))
    case otherwise => List(otherwise).filter(k=>k!=null)
  }

  def isAscendingList(list:List[Int],index:Int): Boolean={
    if(index!=list.size){
      val listA:List[_] = flatten((list.slice(0,index):+list.slice(index+1,list.size)))
      val isAscending = (listA == listA.sortWith(_.toString < _.toString))
      if (isAscending == true) true
      else isAscendingList(list, index + 1)
    } else false
  }
  def almostIncreasingSequence(sequence: List[Int]): Boolean = {
    isAscendingList(sequence,0)
  }

}

package com.none.Arcades

object Arcade7 extends App{

  //Te-ai complicat :D

  def flatten(l : List[_]) : List[_] = l.flatMap { //List[_] prikolna :D
    case l1 : List[_] => flatten(l1.filter(k=>k!=null)) //in scala sa eviti utilizarea valorii null
    case otherwise => List(otherwise).filter(k=>k!=null) //aliasul k pentru filter e in plus se poate de utilizat forma aceasta _ != null adica .filter(_!=null).
  }

  def isAscendingList(list:List[Int],index:Int): Boolean={ //+1 к карме пентру рекурсие )
    if(index!=list.size){
      val listA:List[_] = flatten((list.slice(0,index):+list.slice(index+1,list.size)))
      val isAscending = (listA == listA.sortWith(_.toString < _.toString))
      if (isAscending == true) true //isAscending e deja boolean nu este necesar de al verifica in IF statement cu o valoare anumita :)
      else isAscendingList(list, index + 1)
    } else false
  }
  def almostIncreasingSequence(sequence: List[Int]): Boolean = {
    isAscendingList(sequence,0)// procesarea listei mai bine de facut in recursie cu HEAD :: TAIL constructie
  }

  almostIncreasingSequence(1 :: 2 :: 3 :: 4 :: Nil)

}

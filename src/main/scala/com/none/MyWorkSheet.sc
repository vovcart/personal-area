  def flatten(l : List[_]) : List[_] = l.flatMap {
    case l1 : List[_] => flatten(l1.filter(k=>k!=null))
    case otherwise => List(otherwise).filter(k=>k!=null)
  }

  def isAscendingList(list:Array[Int],index:Int): Boolean={
    if(index!=list.size){
        val listA:List[_] = flatten((list.take(index):+list.drop(index+1).toList).toList)
        val isAscending = (listA == listA.distinct.sortWith((_.toString.toInt<_.toString.toInt)))
        if (isAscending == true) true
        else isAscendingList(list, index + 1)
    } else false
  }
  def almostIncreasingSequence(sequence: Array[Int]): Boolean = {
    isAscendingList(sequence,0)
  }

  val list=Array(123, -17, -5, 1, 2, 3, 12, 43, 45)
  val b:List[_]=flatten((list.take(0):+list.drop(1).toList).toList)
  b.distinct


almostIncreasingSequence(Array(123, -17, -5, 1, 2, 3, 12, 43, 45))
almostIncreasingSequence(Array(1,3,2,1))
almostIncreasingSequence(Array(1,3,2))
almostIncreasingSequence(Array(1,4,2,8))






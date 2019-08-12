def flatten(l: List[_]): List[_] = l.flatMap {
  case l1: List[_] => flatten(l1.filter(_ != None))
  case otherwise => List(otherwise).filter(_ != None)
}

def isAscendingList(list: Array[Int], index: Int): Boolean = {
 
}

def almostIncreasingSequence(sequence: Array[Int]): Boolean = {
  isAscendingList(sequence, 0, 0)
}
val a = Array(10, 1, 2, 3, 4, 5)
almostIncreasingSequence(Array(1, 3, 2, 1))


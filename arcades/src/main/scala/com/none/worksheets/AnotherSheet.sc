def almostIncreasingSequence(sequence: Array[Int]): Boolean = {
  isAsc(None, sequence, 0)
}

def isAsc(prev: Option[Int], list: Array[Int], invalidNumber: Int): Boolean = {
  if (list.length <= 1) invalidNumber < 2
  else {
    val current = list.head
    if (current < list.tail.head) {
      isAsc(Some(current), list.tail, invalidNumber)
    } else {
      if (prev.isEmpty) {
        if (current >= list.tail.head) {
          if (list.length == 2) {
            isAsc(Some(current), list.tail, invalidNumber + 1)
          } else {
            if (current >= list.tail.tail.head) {
              isAsc(prev, list.tail, invalidNumber + 1)
            } else {
              isAsc(Some(current), list.tail.tail, invalidNumber + 1)
            }
          }
        } else {
          isAsc(Some(current), list.tail, invalidNumber)
        }
      } else {
        if (prev.get < list.tail.head) {
          isAsc(prev, list.tail, invalidNumber + 1)
        } else {
          val newList = (list.head :: list.toList.drop(2)).toArray
          isAsc(prev, newList, invalidNumber + 1)
        }
      }
    }
  }
}

val list = Array(1,2,3,4,5,1,6)
val a=System.nanoTime()
almostIncreasingSequence(list)
val b=System.nanoTime()
b-a
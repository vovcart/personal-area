val n = Array(4, 2, 9, 11, 2, 16)
val a = n.sortWith(_ < _).dropWhile(_ == (-1))

def sortList(listToSort: Array[Int], sortedList: Array[Int],formatedList:Array[Int], i: Int, j: Int): Array[Int] = {
  if (i < listToSort.length) {
    if (listToSort(i) == (-1)) {
      sortList(listToSort, sortedList :+ listToSort(i), formatedList,i + 1, j)
    } else {
      sortList(listToSort, sortedList :+ formatedList(j), formatedList,i + 1,j+1)
    }
  } else sortedList
}

sortList(n, Array(),a, 0, 0)
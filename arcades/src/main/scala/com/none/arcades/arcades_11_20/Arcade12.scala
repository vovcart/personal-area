package com.none.arcades.arcades_11_20

object Arcade12 {
  def sortByHeight(a: Array[Int]): Array[Int] = {
    val n = a.sortWith(_ < _).dropWhile(_ == (-1))
    sortList(a, Array(), n, 0, 0)
  }

  def sortList(
      listToSort: Array[Int],
      sortedList: Array[Int],
      formatedList: Array[Int],
      i: Int,
      j: Int
  ): Array[Int] = {
    if (i < listToSort.length) {
      if (listToSort(i) == (-1)) {
        sortList(
          listToSort,
          sortedList :+ listToSort(i),
          formatedList,
          i + 1,
          j
        )
      } else {
        sortList(
          listToSort,
          sortedList :+ formatedList(j),
          formatedList,
          i + 1,
          j + 1
        )
      }
    } else sortedList
  }
}

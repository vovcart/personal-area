val a = Array("aba", "bbb", "bab")

val b = Array("ab",
              "bb",
              "aa")

val c = Array("zzzzab",
              "zzzzbb",
              "zzzzaa")

val d = Array("abc",
              "abx",
              "axx",
              "abx",
              "abc")

val e = Array("abc",
              "bef",
              "bcc",
              "bec",
              "bbc",
              "bdc")

val f = Array("ff",
              "gf",
              "af",
              "ar",
              "hf")

def connected(element1: String, element2: String): Boolean = {
  element1.indices.map(i => if (element1(i) == element2(i)) 0 else 1).sum == 1
}
def getElementsConnectedList(list: Array[String],
n: Int,
i: Int,
j: Int,
indexList: List[Int],
elementsConnectedList: Array[String]
): Boolean = {
  i match {
    case a if (elementsConnectedList.length == list.length) => true
    case b if (n==list.length-1) =>false
    case c if (j == list.length) => getElementsConnectedList(list, n + 1, n + 1, 0, List(), Array(list(n+1)))
    case d if (!indexList.contains(j) && connected(list(i), list(j))) =>
    getElementsConnectedList(list, n, j, 0, indexList :+ i :+ j, (elementsConnectedList :+ list(j)))
    case _ => getElementsConnectedList(list, n, i, j + 1, indexList, elementsConnectedList)
  }
}



def stringsRearrangement(inputArray: Array[String]): Boolean = {
  getElementsConnectedList(inputArray, 0, 0, 1, List(), Array(inputArray(0)))
}

stringsRearrangement(a.sorted)
stringsRearrangement(b.sorted)
stringsRearrangement(c.sorted)
stringsRearrangement(d.sorted)
stringsRearrangement(e.sorted)
stringsRearrangement(f.sorted)

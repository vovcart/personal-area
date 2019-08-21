val a = "aabb"
val b= a.filter(_==a.distinct.head)
a.diff(b)
//val b = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"

def palindromeRearranging(inputString: String): Boolean = {
  rearrangedList(inputString, inputString.distinct, 0)
}

def rearrangedList(list: String, distinctList: String, sumNonPareStrings: Int): Boolean = {
  val s=list.filter(_ == distinctList.head)
  if (distinctList.isEmpty) {
    sumNonPareStrings < 2
  } else {
    if (s.length % 2 == 0) {
      rearrangedList(list.diff(s), distinctList.tail, sumNonPareStrings)
    } else {
      rearrangedList(list.diff(s), distinctList.tail, sumNonPareStrings + 1)
    }
  }
}

palindromeRearranging(a)



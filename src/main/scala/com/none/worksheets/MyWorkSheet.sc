val a = Array(1, 2, 1)
val b = 1
val c = 3
val d: Array[Int] = Array()

def arrayReplace(
    inputArray: Array[Int],
    elemToReplace: Int,
    substitutionElem: Int
): Array[Int] = {
  val replacedArray: Array[Int] = Array()
  inputArray.indices
    .map(
      f =>
        if (inputArray(f) == elemToReplace) replacedArray :+ substitutionElem
        else replacedArray :+ inputArray(f)
    )
    .toArray
    .flatten
}

arrayReplace(Array(1, 2, 1), 1, 3)
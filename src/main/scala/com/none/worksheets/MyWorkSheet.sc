val a = Array(10, 11, 13)
(a(0)-a(1)).abs
(0 until a.length-1).map(i=> (a(i)-a(i+1)).abs).max

//def arrayMaximalAdjacentDifference(inputArray: Array[Int]): Int = {
//inputArray.foldLeft(0)()
//
//}

//arrayMaximalAdjacentDifference(a)



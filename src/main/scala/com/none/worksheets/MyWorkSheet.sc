val a = Array(1, 2, 3)
val b = Array(1, 10, 2)

a.diff(b).length + b.diff(a).length

(a.diff(b).length < 2) && (0 until a.length)
  .map(i => if (a(i) != b(i)) 1 else 0).sum < 3

//def areSimilar(a: Array[Int], b: Array[Int]): Boolean = {
//
//}
def almostIncreasingSequence1(sequence: Array[Int]): Boolean = {
  (1 until sequence.length).map(i => if (sequence(i-1) < sequence(i)) 0 else 1).sum <= 1 &&
  (2 until sequence.length).map(i => if (sequence(i-2) < sequence(i)) 0 else 1).sum <= 1
}
val list = Array(1,2,3,4,5,1,6)

val a=System.nanoTime()
almostIncreasingSequence1(list)
val b=System.nanoTime()
b-a
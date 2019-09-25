val n = 7
val m = 23
n & (~(n))

def getPower(n:Int, m:Int):Int={
  val z="%32d".format(BigInt(n.toBinaryString)).reverse
  val x="%32d".format(BigInt(m.toBinaryString)).reverse
  z.indices.indexWhere(i=> z(i)!=x(i))
}

def differentRightmostBit(n: Int, m : Int): Int = {
  return Math.pow(2,getPower(n,m)).toInt
}

differentRightmostBit(n,m)


def differentRightmostBit(n: Int, m : Int): Int = {
  return (n ^ m) & (~(n ^ m) + 1)
}
val a = 248622
val b = 642386

val c= a.toString.toArray
val d= b.toString.toArray

c.indices.map(i=> if(c(i)%2==0) 0 else 1).sum==0

def evenDigitsOnly(n: Int): Boolean = {
  val nList=n.toString.toArray
  nList.indices.map(i=> if(nList(i)%2==0) 0 else 1).sum==0
}

evenDigitsOnly(a)
evenDigitsOnly(b)
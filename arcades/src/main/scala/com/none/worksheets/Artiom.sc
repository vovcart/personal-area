val a = Array("aba", "bbb", "bab").toSeq

case class Tupple(a: String, b: String){
  def contains(value: String): Boolean = {
    a==value || b == value
  }
}


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

def areSimilar(element1: String, element2: String): Boolean = {
  element1.indices.map(index => if (element1(index) == element2(index)) 0 else 1).sum == 1
}

def getElementLinkedWith(link: (String, String), element: String): Option[String] = {
  element match {
    case link._1 => Some(link._2)
    case link._2 => Some(link._1)
    case _ => None
  }
}
def createLink(element1: String, element2: String): Option[(String, String)] = {
  if (areSimilar(element1, element2)) {
    Some(Tuple2(element1, element2))
  } else
    None
}

def getLinks(restOfElements: Seq[String],
             current: String,
             links: Seq[(String, String)]
            ): Seq[(String, String)] = {
  if (restOfElements.isEmpty) {
    links
  } else {
    val linksWithCurrent = links.union(
      restOfElements.flatMap(
        element => createLink(current, element)))
    getLinks(restOfElements.tail, restOfElements.head, linksWithCurrent)
  }
}

val aLinks = getLinks(a.tail, a.head, Seq())
  .map(tmp => Tupple(tmp._1,tmp._2))



private def find(currentTupple: Tupple, restOfheList: Seq[Tupple], accumulator: Seq[Tupple], chainSize: Int): Boolean = {
  if (restOfheList.isEmpty){
    accumulator.size == chainSize-1
  } else {
    restOfheList
      .filter(tupple => tupple.contains(currentTupple.b))
      .foldLeft(false)(
        (found, newTupple) => found || find(newTupple, restOfheList.diff(Seq(newTupple)), accumulator.:+(currentTupple), chainSize)
        )
  }
}

aLinks.foldLeft(false)((found, tupple) => found || find(tupple, aLinks.diff(Seq(tupple)), Seq(), aLinks.size))
//a.map(tupple => find(Tupple(tupple.b, tupple.a), a.diff(Seq(tupple)), Seq(), a.size))
//}





def stringsRearrangement(inputArray: Array[String]): Boolean = {
  val inputLinks = getLinks(inputArray.tail, inputArray.head, Seq()).map(tmp => Tupple(tmp._1, tmp._2))
  inputLinks.foldLeft(false)((found, tupple) => found || find(tupple, inputLinks.diff(Seq(tupple)), Seq(), inputArray.length)) ||
    inputLinks.foldLeft(false)((found, tupple) => found || find(Tupple(tupple.b, tupple.a), inputLinks.diff(Seq(tupple)), Seq(), inputArray.length))
}
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

private def find(currentTupple: Tupple, restOfheList: Seq[Tupple], accumulator: Seq[Tupple], chainSize: Int): Boolean = {

  if (restOfheList.isEmpty) {
    (accumulator :+ currentTupple).length == chainSize - 1
  } else {
    restOfheList
      .filter(tupple => tupple.contains(currentTupple.b))
      .map(tupple => if (tupple.b == currentTupple.b) tupple.swap() else tupple)
      .foldLeft(false)(
        (found, newTupple) => {
          found || find(newTupple, restOfheList.diff(Seq(newTupple)), accumulator.:+(currentTupple), chainSize)
        })
  }
}

case class Tupple(a: String, b: String) {
  def contains(value: String): Boolean = {
    a == value || b == value
  }

  def swap(): Tupple = {
    Tupple(b, a)
  }
}
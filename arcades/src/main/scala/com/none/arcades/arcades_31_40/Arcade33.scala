package com.none.arcades.arcades_31_40

object Arcade33 {

  def stringsRearrangement(inputArray: Array[String]): Boolean = {
    val nodes = createNodes(inputArray)
    val links = getLinks(nodes.tail, nodes.head, Seq())
    links.foldLeft(false)((found, tupple) => found || find(tupple, listWithoutLink(tupple, links.diff(Seq(tupple))), Seq(), inputArray.length)) ||
      links.foldLeft(false)((found, tupple) => found || find(tupple.swap(), listWithoutLink(tupple.swap, links.diff(Seq(tupple))), Seq(), inputArray.length))
  }

  def createNodes(elements: Array[String]): Seq[Node] = {
    elements.indices.map(i => Node(i, elements(i)))
  }

  def getLinks(restOfElements: Seq[Node], current: Node, links: Seq[Tupple]): Seq[Tupple] = {
    if (restOfElements.isEmpty) {
      links
    } else {
      val connectionsWithCurrent = links.union(restOfElements.flatMap(element => createLink(current, element)))
      getLinks(restOfElements.tail, restOfElements.head, connectionsWithCurrent)
    }
  }

  def createLink(element1: Node, element2: Node): Option[Tupple] = {
    if (areSimilar(element1.value, element2.value)) {
      Some(Tupple(element1, element2))
    } else
      None
  }

  def listWithoutLink(element1: Tupple, restOfElements: Seq[Tupple]): Seq[Tupple] = {
    restOfElements.filter(tupple => (!tupple.containsId(element1.a.id)))
  }

  def isListCompleted(list: Seq[Tupple], last: Tupple, chainSize: Int): Boolean = {
    list match {
      case a if (a.isEmpty) => false
      case b if (list.take(list.indexOf(list.last)).map(tupple => {
        if (tupple.containsId(last.a.id) || tupple.containsId(last.b.id)) 1 else 0
      }).sum >= 1) => list.length == chainSize - 1
      case c if (areSimilar(c.last.b.value, last.a.value) || areSimilar(c.last.b.value, last.b.value)) =>
      (list :+ last).length == chainSize - 1
      case _ => list.length == chainSize
    }
  }

  def areSimilar(element1: String, element2: String): Boolean = {
    element1.indices.map(index => if (element1(index) == element2(index)) 0 else 1).sum == 1
  }


  private def find(currentTupple: Tupple,
                   restOfLinks: Seq[Tupple],
                   accumulator: Seq[Tupple],
                   chainSize: Int): Boolean = {
    println(s"Iteration for currentTupple=$currentTupple; accumulator=$accumulator and restOfTheLinks")
    restOfLinks.foreach(println(_))
    val tmp = if (restOfLinks.isEmpty || accumulator.length == chainSize - 1) {
      isListCompleted(accumulator, currentTupple, chainSize)
    } else {
      val filteredList = restOfLinks
        .filter(tupple => tupple.containsNode(currentTupple.b))
        .map(t => {
          print(t, ",")
          t
        })
      println(s"Filtered list: ${filteredList}")

      filteredList.map(tupple => if (tupple.b == currentTupple.b) tupple.swap() else tupple)
                  .foldLeft(false)(
                    (found, newTupple) => {
                      found || find(newTupple, listWithoutLink(currentTupple, restOfLinks.diff(Seq(newTupple))), accumulator.:+(currentTupple), chainSize)
                    })
    }
    println("------------------------------------")
    tmp
  }

}
case class Tupple(a: Node, b: Node) {
  def containsNode(node: Node): Boolean = {
    a == node || b == node
  }

  def containsId(id: Int): Boolean = {
    a.id == id || b.id == id
  }

  def swap(): Tupple = {
    Tupple(b, a)
  }
}
case class Node(id: Int, value: String)




def permutationsSgn[T]: List[T] => List[(Int,List[T])] = {
  case Nil => List((1,Nil))
  case xs => {
    for {
      (x, i) <- xs.zipWithIndex
      (sgn,ys) <- permutationsSgn(xs.take(i) ++ xs.drop(1 + i))
    } yield {
      val sgni = sgn * (2 * (i%2) - 1)
      (sgni, (x :: ys))
    }
  }
}

def det(m:List[List[Int]]) = {
  val summands =
    for {
      (sgn,sigma) <- permutationsSgn(m.indices.toList)
    }
      yield {
        val factors =
          for (i <- m.indices)
            yield m(i)(sigma(i))
        factors.toList.foldLeft(sgn)({case (x,y) => x * y})
      }
  summands.foldLeft(0)({case (x,y) => x + y})
}
def areSimilar(element1: String, element2: String): Boolean = {
  element1.indices.map(index => if (element1(index) == element2(index)) 0 else 1).sum == 1
}

def createMatrice(list:List[String])={
  list.map(i=>list.map( j=> if(areSimilar(i,j)) 1 else 0))
}

def stringsRearrangement(inputArray: Array[String]): Boolean = {
  val matrice=createMatrice(inputArray.toList)
  det(matrice)!=0
}


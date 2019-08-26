package com.none.arcades

object Arcade4 {

  //SUPER !!!

  //NOTE
  //scala are metoda standarda si are definit Ordering classe pentru tipuri de date simpli
  //inputArray.max

  def adjacentElementsProduct(inputArray: Array[Int]): Int = {
    getMaxProduct(inputArray, inputArray(0) * inputArray(1), 1)
    //pentru cazul cand array e de un elemente
    //inputArray(0)*inputArray(1) ne da exceptie

  }

  def getMaxProduct(list: Array[Int], max: Int, index: Int): Int = {
    if (list.size == 1) list(0)
    else {
      if (index == list.size - 1) max
      else {
        val next = index + 1
        val potentialMax = list(index) * Some(list(next)).getOrElse(1)
        if (max < potentialMax) getMaxProduct(list, potentialMax, index + 1)
        else getMaxProduct(list, max, next)
      }
    }
    //Observa cate ori se executa aceeasi instructiune
    //index+1
    //list(index)*list(index+1)
    //pentru asa gen de instructiuni ... definim un val de la inceput
    // val next = index + 1
    // val potentialMax = list(index)*list(next)
    //Ele mult nu costa, dar totusi ma FT-e constienta... :D
  }
}

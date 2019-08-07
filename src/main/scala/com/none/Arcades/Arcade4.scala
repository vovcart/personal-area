package com.none.Arcades

object Arcade4 {
  def adjacentElementsProduct(inputArray: Array[Int]): Int = {
    getMaxProduct(inputArray,inputArray(0)*inputArray(1),1)
  }

  def getMaxProduct(list:Array[Int],max:Int, index:Int):Int={
    if(index==list.size-1) max
    else if(max < list(index)*list(index+1)) getMaxProduct(list,list(index)*list(index+1),index+1)
    else getMaxProduct(list,max,index+1)
  }
}

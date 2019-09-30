package com.none.core.my_solution.cores_21_30

object Core24 {

  def equalPairOfBits(n: Int, m : Int): Int = {
    return Math.pow(2,getIndexOfEqualsBits("%08d".format(n.toBinaryString.toInt).reverse,
                                           "%08d".format(m.toBinaryString.toInt).reverse)).toInt
  }

  def getIndexOfEqualsBits(a:String, b:String):Int={
    a.indices.indexWhere(i=> a(i)==b(i))
  }

}

package com.none.solved_arcades_from_net

object SolvedArcade28 {
  //Solution nr-1
  def alphabeticShift(inputString: String): String = {
    inputString.map(c => if (c == 'z') 'a' else (c.toInt + 1).toChar)
  }
}

package com.none.arcades.my_solution.arcades_41_50

object Arcade42 {
  def bishopAndPawn(bishop: String, pawn: String): Boolean = {
    (bishop.getBytes()(0) - pawn.getBytes()(0)).abs == (bishop.getBytes()(1) - pawn.getBytes()(10)).abs
  }
}

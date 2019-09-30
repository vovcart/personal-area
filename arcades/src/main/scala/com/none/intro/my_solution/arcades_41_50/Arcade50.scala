package com.none.intro.my_solution.arcades_41_50

object Arcade50 {

  def chessKnight(cell: String): Int = {
    val moves = Seq(Cell(cell(0) + 1, cell(1) + 2),
                    Cell(cell(0) + 1, cell(1) - 2),
                    Cell(cell(0) - 1, cell(1) + 2),
                    Cell(cell(0) - 1, cell(1) - 2),
                    Cell(cell(0) + 2, cell(1) + 1),
                    Cell(cell(0) + 2, cell(1) - 1),
                    Cell(cell(0) - 2, cell(1) + 1),
                    Cell(cell(0) - 2, cell(1) - 1))
    moves.count(cell => {
      (97 to 104).contains(cell.x) && (49 to 56).contains(cell.y)
    })
  }

  case class Cell(x: Int, y: Int)

}

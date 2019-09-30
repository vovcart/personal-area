package com.none.intro.my_solution.arcades_51_60


object Arcade60 {

  def sudoku1(grid: Array[Array[Int]]): Boolean = {
    val sumOfEvery3Digits =
      grid
        .indices
        .by(3)
        .flatMap(i => {
          grid.indices
              .map(j => {
                grid(j)
                  .slice(i, i + 3)
                  .sum
              })
        })

    sumOfEvery3Digits.indices.by(3).map(i => sumOfEvery3Digits.slice(i, i + 3).sum).count(_ != 45) == 0 &&
      grid.count(_.diff(1 to 9).length == 0) == 9 &&
      grid.transpose.count(_.diff(1 to 9).length == 0) == 9
  }

  //Solution nr-2
  def sudoku2(grid: Array[Array[Int]]): Boolean = {
    val sumOfEvery3Digits = for {
      i <- grid.indices.by(3)
      j <- grid(i).indices
    } yield grid(j).slice(i, i + 3).sum

    val areSumsOf3x3SquareValid =
      sumOfEvery3Digits.indices.by(3).map(i => sumOfEvery3Digits.slice(i, i + 3).sum).count(_ != 45) == 0

    val areRowsDistincts =
      grid.count(_.diff(1 to 9).isEmpty) == 9

    val areColumnsDistincts =
      grid.transpose.count(_.diff(1 to 9).isEmpty) == 9

    areSumsOf3x3SquareValid && areRowsDistincts && areColumnsDistincts
  }
}


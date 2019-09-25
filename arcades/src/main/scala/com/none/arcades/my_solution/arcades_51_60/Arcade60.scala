package com.none.arcades.my_solution.arcades_51_60


object Arcade60{

  def sudoku(grid: Array[Array[Int]]): Boolean = {
    val sumOfEvery3Digits =
      grid
        .indices.by(3)
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
}


package com.none.arcades

object Arcade29 {
  
  def chessBoardCellColor(cell1: String, cell2: String): Boolean = {
    (cell1(0).toByte+cell1(1).toByte+cell2(0).toByte+cell2(1)).toByte%2==0
  }
}

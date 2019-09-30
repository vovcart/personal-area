package com.none.intro.my_solution.arcades_11_20

object Arcade19 {

  def areEquallyStrong(
      yourLeft: Int,
      yourRight: Int,
      friendsLeft: Int,
      friendsRight: Int
  ): Boolean = {
    (yourLeft == friendsLeft || yourLeft == friendsRight) && (yourRight == friendsLeft || yourRight == friendsRight)
  }
}

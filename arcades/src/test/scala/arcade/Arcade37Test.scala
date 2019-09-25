package arcade

import com.none.arcades.my_solution.arcades_31_40.Arcade37
import org.scalatest.{FunSuite, Matchers}

class Arcade37Test extends FunSuite with Matchers {

  test("A37-1") {
    Arcade37.arrayMaxConsecutiveSum(Array(2, 3, 5, 1, 6), 2).shouldBe(8)
  }
}

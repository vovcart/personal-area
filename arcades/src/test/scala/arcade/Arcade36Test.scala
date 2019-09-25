package arcade

import com.none.arcades.my_solution.arcades_31_40.Arcade36
import org.scalatest.{FunSuite, Matchers}

class Arcade36Test extends FunSuite with Matchers{

  test("A35-1"){
    Arcade36.differentSymbolsNaive("aba")
            .shouldBe(2)
  }

}

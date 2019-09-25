package arcade

import com.none.arcades.my_solution.arcades_31_40.Arcade35
import org.scalatest.{FunSuite, Matchers}

class Arcade35Test extends FunSuite with Matchers{

  test("A35-1"){
    Arcade35.firstDigit("lal-1,bgasd")
            .shouldBe('1')
  }

}

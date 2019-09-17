import com.none.arcades.arcades_31_40.Arcade40
import org.scalatest.{FunSuite, Matchers}

class Arcade40Test extends FunSuite with Matchers{

  test("A40-1"){

    Arcade40.longestDigitsPrefix(""" "  3) always """).shouldBe("")

  }

}

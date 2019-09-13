import com.none.arcades.Arcade34
import org.scalatest.{FunSuite, Matchers}

class Arcade34Test extends FunSuite with Matchers {

  test("Arcade34_1") {
    Arcade34.extractEachKth(Array(1, 2, 1, 2, 1, 2, 1, 2), 10) shouldBe (Array(1, 2, 1, 2, 1, 2, 1, 2))
  }

  test("Arcade34_2") {
    Arcade34.extractEachKth(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 2) shouldBe (Array(1, 3, 5, 7, 9))
  }

}

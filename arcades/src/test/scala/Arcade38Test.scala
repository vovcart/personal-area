import com.none.arcades.Arcade38
import org.scalatest.{FunSuite, Matchers}

class Arcade38Test extends FunSuite with Matchers{

  test("A38-1"){
    Arcade38.growingPlant(7,3,443) shouldBe(110)
  }

}

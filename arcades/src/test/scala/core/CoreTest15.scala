package core

import com.none.core.my_solution.cores_11_20.Core15
import org.scalatest.{FunSuite, Matchers}

class CoreTest15 extends FunSuite with Matchers {
  test ("C15-1"){
    Core15.willYou(true, true, true).shouldBe(false)
  }
  test ("C15-2"){
    Core15.willYou(true, false, true).shouldBe(true)
  }
  test ("C15-3"){
    Core15.willYou(true, true, false).shouldBe(true)
  }
  test ("C15-4"){
    Core15.willYou(false, true, true).shouldBe(true)
  }
  test ("C15-5"){
    Core15.willYou(true, false, false).shouldBe(false)
  }
  test ("C15-6"){
    Core15.willYou(false, true, false).shouldBe(false)
  }
  test ("C15-7"){
    Core15.willYou(false, false, true).shouldBe(true)
  }
  test ("C15-8"){
    Core15.willYou(false, false, false).shouldBe(false)
  }

}

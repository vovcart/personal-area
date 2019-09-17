import com.none.arcades.arcades_41_50.Arcade45
import org.scalatest.{FunSuite, Matchers}

class Arcade45Test extends FunSuite with Matchers {

  test("A45-1") {
    Arcade45.buildPalindrome("abcdc").shouldBe("abcdcba")
  }
  test("A45-2") {
    Arcade45.buildPalindrome("ababab").shouldBe("abababa")
  }
  test("A45-3") {
    Arcade45.buildPalindrome("abba").shouldBe("abba")
  }
  test("A45-4") {
    Arcade45.buildPalindrome("abaa").shouldBe("abaaba")
  }
  test("A45-5") {
    Arcade45.buildPalindrome("aaaaba").shouldBe("aaaabaaaa")
  }
  test("A45-6") {
    Arcade45.buildPalindrome("abc").shouldBe("abcba")
  }
  test("A45-7") {
    Arcade45.buildPalindrome("kebab").shouldBe("kebabek")
  }
  test("A45-8") {
    Arcade45.buildPalindrome("abccba").shouldBe("abccba")
  }
  test("A45-9") {
    Arcade45.buildPalindrome("abcabc").shouldBe("abcabcbacba")
  }
  test("A45-10") {
    Arcade45.buildPalindrome("cbdbedffcg").shouldBe("cbdbedffcgcffdebdbc")
  }
  test("A45-11") {
    Arcade45.buildPalindrome("euotmn").shouldBe("euotmnmtoue")
  }

}

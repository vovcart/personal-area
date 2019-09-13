import com.none.arcades.arcades_31_40.Arcade33
import org.scalatest.{FunSuite, Matchers}

class Arcade33Test extends FunSuite with Matchers  {
  test("1") {
    Arcade33.stringsRearrangement(Array("aba", "bbb", "bab")).shouldBe(false)
  }
  //Same result
  test("2") {
    Arcade33.stringsRearrangement(Array("ab", "bb", "aa")).shouldBe(true)
    //  }
    //  test("ab,aa,bb") {
    //    pending
    //    Arcade33_1.stringsRearrangement(Array("ab", "aa", "bb")).shouldBe(true)
    //  }
    //
    //  test("bb,aa,ab") {
    //    pending
    //    Arcade33_1.stringsRearrangement(Array("bb", "aa", "ab")).shouldBe(true)
    //  }
    //  test("bb,ab,aa") {
    //    pending
    //    Arcade33_1.stringsRearrangement(Array("bb", "ab", "aa")).shouldBe(true)
    //  }
    //
    //  test("aa,bb,ab") {
    //    pending
    //    Arcade33_1.stringsRearrangement(Array("aa", "bb", "ab")).shouldBe(true)
    //  }
    //  test("aa,ab,bb") {
    //    pending
    //    Arcade33_1.stringsRearrangement(Array("aa", "ab", "bb")).shouldBe(true)
  }
  //Same result


  test("3") {
    Arcade33.stringsRearrangement(Array("q","q")).shouldBe(false)
  }
  test("4") {
    Arcade33.stringsRearrangement(Array("zzzzab",
                                          "zzzzbb",
                                          "zzzzaa")).shouldBe(true)
  }
  test("5") {
    Arcade33.stringsRearrangement(Array("ab",
                                          "ad",
                                          "ef",
                                          "eg")).shouldBe(false)
  }
  test("6") {
    Arcade33.stringsRearrangement(Array("abc",
                                          "bef",
                                          "bcc",
                                          "bec",
                                          "bbc",
                                          "bdc")).shouldBe(true)
  }
  test("7") {
    Arcade33.stringsRearrangement(Array("abc",
                                          "abx",
                                          "axx",
                                          "abc")).shouldBe(false)
  }
  test("8") {
    Arcade33.stringsRearrangement(Array("abc",
                                          "abx",
                                          "axx",
                                          "abx",
                                          "abc")).shouldBe(true)
  }
  test("9") {
    Arcade33.stringsRearrangement(Array("f",
                                          "g",
                                          "a",
                                          "h")).shouldBe(true)
  }
  test("10") {
    Arcade33.stringsRearrangement(Array("ff",
                                          "gf",
                                          "af",
                                          "ar",
                                          "hf")).shouldBe(true)
  }
  test("11") {
    Arcade33.stringsRearrangement(Array("a",
                                          "b",
                                          "c")).shouldBe(true)
  }
  test("12") {
    Arcade33.stringsRearrangement(Array("aa",
                                          "bb",
                                          "cc")).shouldBe(false)
  }
  test("13") {
    Arcade33.stringsRearrangement(Array("bbc",
                                          "bba",
                                          "abc")).shouldBe(true)
  }
  test("14") {
    Arcade33.stringsRearrangement(Array("oh",
                                          "eh",
                                          "ah",
                                          "po",
                                          "op")).shouldBe(false)
  }
  test("15") {
    Arcade33.stringsRearrangement(Array("zzzabzczaba",
                                          "zzzabzczaaa",
                                          "zzzabzczabb",
                                          "zzzabzczbbb")).shouldBe(true)
  }
  test("16") {
    Arcade33.stringsRearrangement(Array("zzzabzczaaa",
                                          "zzzabzczaaa",
                                          "zzzabzczaaa",
                                          "zzzabzczaaa")).shouldBe(false)
  }
  test("17") {
    Arcade33.stringsRearrangement(Array("abc",
                                          "xbc",
                                          "xxc",
                                          "xbc",
                                          "aby",
                                          "ayy",
                                          "aby",
                                          "azc")).shouldBe(false)
  }
  test("18") {
    Arcade33.stringsRearrangement(Array("abc",
                                          "bef",
                                          "bcc",
                                          "bew",
                                          "zew",
                                          "zyw",
                                          "bec",
                                          "bbc",
                                          "bdc")).shouldBe(true)
  }
  test("19") {
    Arcade33.stringsRearrangement(Array("abacabaabczzzzz",
                                          "abacababefzzzzz",
                                          "abacababcczzzzz",
                                          "abacababeczzzzz",
                                          "abacababbczzzzz",
                                          "abacababdczzzzz")).shouldBe(true)
  }
  test("20") {
    Arcade33.stringsRearrangement(Array("abc",
                                          "xbc",
                                          "xxc",
                                          "xbc",
                                          "aby",
                                          "ayy",
                                          "aby")).shouldBe(true)
  }
  test("21") {
    Arcade33.stringsRearrangement(Array("abc",
                                          "xbc",
                                          "axc",
                                          "abx")).shouldBe(false)
  }
}

package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

import org.scalatest._
import flatspec._
import matchers._

class OneAwayTest extends AnyFlatSpec with should.Matchers {
  it should "return true for pale and pale" in {
    OneAway.oneAway("pale", "pale") shouldBe true
  }
  it should "return true for pale and ple" in {
    OneAway.oneAway("pale", "ple") shouldBe true
  }
  it should "return true for pales and pale" in {
    OneAway.oneAway("pales", "pale") shouldBe true
  }
  it should "return true for pale and bale" in {
    OneAway.oneAway("pale", "bale") shouldBe true
  }
  it should "return true for pale and ppale" in {
    OneAway.oneAway("pale", "ppale") shouldBe true
  }
  it should "return true for palee and pale" in {
    OneAway.oneAway("palee", "pale") shouldBe true
  }
  it should "return false for pale and bake" in {
    OneAway.oneAway("pale", "bake") shouldBe false
  }
  it should "return false for pal e and pal" in {
    OneAway.oneAway("pal e", "pal") shouldBe false
  }
}

package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

import org.scalatest._
import flatspec._
import matchers._

class StringRotationTest extends AnyFlatSpec with should.Matchers {
  it should "return false for empty string" in {
    StringRotation.stringRotation("", "") shouldBe false
  }
  it should "return true for identical strings" in {
    StringRotation.stringRotation("asdfghj", "asdfghj") shouldBe true
  }
  it should "return false for string with one char difference" in {
    StringRotation.stringRotation("asdfghjk", "asdfghj") shouldBe false
  }
  it should "return true for waterbottle and erbottlewat" in {
    StringRotation.stringRotation("waterbottle", "erbottlewat") shouldBe true
  }
}

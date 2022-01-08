package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

import org.scalatest._
import flatspec._
import matchers._

class StringCompressionTest extends AnyFlatSpec with should.Matchers {
  it should "return as is for empty string" in {
    StringCompression.stringCompression("") shouldBe ""
  }
  it should "return same string for a" in {
    StringCompression.stringCompression("a") shouldBe "a"
  }
  it should "return same string for aa" in {
    StringCompression.stringCompression("aa") shouldBe "aa"
  }
  it should "return compressed string for aabcccccaaa" in {
    StringCompression.stringCompression("aabcccccaaa") shouldBe "a2b1c5a3"
  }
  it should "return same string for aabbccaa" in {
    StringCompression.stringCompression("aabbccaa") shouldBe "aabbccaa"
  }
  it should "return compressed string for aabcccccca" in {
    StringCompression.stringCompression("aabcccccca") shouldBe "a2b1c6a1"
  }
}

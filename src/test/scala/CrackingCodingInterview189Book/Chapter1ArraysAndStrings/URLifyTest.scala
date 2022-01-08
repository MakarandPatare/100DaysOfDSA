package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

import org.scalatest._
import flatspec._
import matchers._

class URLifyTest extends AnyFlatSpec with should.Matchers {
  it should "return the empty string as is" in {
    URLify.urlIfy("".toCharArray, 0) shouldBe "".toCharArray
  }
  it should "replace spaces in 'Mr John Smith    '" in {
    URLify.urlIfy("Mr John Smith    ".toCharArray, 13) shouldBe "Mr%20John%20Smith".toCharArray
  }
  it should "replace spaces in 'Mr John Smith       ' with space at the end" in {
    URLify.urlIfy("Mr John Smith       ".toCharArray, 14) shouldBe "Mr%20John%20Smith%20".toCharArray
  }
  it should "replace spaces in ' Mr John Smith      ' with space at the beginning" in {
    URLify.urlIfy(" Mr John Smith      ".toCharArray, 14) shouldBe "%20Mr%20John%20Smith".toCharArray
  }
  it should "replace spaces in ' Mr John Smith         ' with space at the beginning and end" in {
    URLify.urlIfy(" Mr John Smith         ".toCharArray, 15) shouldBe "%20Mr%20John%20Smith%20".toCharArray
  }

}

package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

import org.scalatest._
import flatspec._
import matchers._

class PalindromePermutationTest extends AnyFlatSpec with should.Matchers {
  it should "return true for the empty string" in {
    PalindromePermutation.palindromePermutation("") shouldBe true
  }
  it should "work for given example 'Tact Coa'" in {
    PalindromePermutation.palindromePermutation("Tact Coa") shouldBe true
  }
  it should "work for given example without spaces 'TactCoa'" in {
    PalindromePermutation.palindromePermutation("TactCoa") shouldBe true
  }
  it should "return false for incorrect input" in {
    PalindromePermutation.palindromePermutation("TactdCoa") shouldBe false
  }
}

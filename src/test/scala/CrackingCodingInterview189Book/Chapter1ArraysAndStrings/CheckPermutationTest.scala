package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

import org.scalatest._
import flatspec._
import matchers._

class CheckPermutationTest extends AnyFlatSpec with should.Matchers {
  it should "return true if both strings are empty" in {
    CheckPermutation.checkPermutation("", "") shouldBe true
  }
  it should "return true for asdfg123 and gfdsa213" in {
    CheckPermutation.checkPermutation("asdfg123", "gfdsa213") shouldBe true
  }
  it should "return false for asdfg123 and GFDSA213" in {
    CheckPermutation.checkPermutation("asdfg123", "GFDSA213") shouldBe false
  }
  it should "return false for asdfg123 and a s dfg321" in {
    CheckPermutation.checkPermutation("asdfg123", "a s dfg321") shouldBe false
  }
  it should "return false for asdfg123 and gfdsaa213" in {
    CheckPermutation.checkPermutation("asdfg123", "gfdsaa213") shouldBe false
  }
}

package Blind75.Array

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ContainsDuplicateTest extends AnyFlatSpec with should.Matchers {
  it should "return true for example 1" in {
    ContainsDuplicate.containsDuplicateSet(Array(1,2,3,1)) shouldBe true
    ContainsDuplicate.containsDuplicateSorting(Array(1,2,3,1)) shouldBe true
    ContainsDuplicate.containsDuplicateHashMap(Array(1,2,3,1)) shouldBe true
  }
  it should "return false for example 2" in {
    ContainsDuplicate.containsDuplicateSet(Array(1,2,3,4)) shouldBe false
    ContainsDuplicate.containsDuplicateSorting(Array(1,2,3,4)) shouldBe false
    ContainsDuplicate.containsDuplicateHashMap(Array(1,2,3,4)) shouldBe false
  }
  it should "return true for example 3" in {
    ContainsDuplicate.containsDuplicateSet(Array(1,1,1,3,3,4,3,2,4,2)) shouldBe true
    ContainsDuplicate.containsDuplicateSorting(Array(1,1,1,3,3,4,3,2,4,2)) shouldBe true
    ContainsDuplicate.containsDuplicateHashMap(Array(1,1,1,3,3,4,3,2,4,2)) shouldBe true
  }
}

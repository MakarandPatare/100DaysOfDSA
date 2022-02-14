package Blind75.Array

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class TwoSumTest extends AnyFlatSpec with should.Matchers {
  it should "return None for empty input array" in {
    TwoSum.twoSum(Array(), 0) shouldBe None
  }
  it should "return None for single element array" in {
    TwoSum.twoSum(Array(1), 0) shouldBe None
  }
  it should "return None if solution is not found" in {
    TwoSum.twoSum(Array(1,2,3), 10) shouldBe None
  }
  it should "return correct output for sorted ascending array" in {
    TwoSum.twoSum(Array(1,2,3,4,5,6,7,8,9), 16) shouldBe Some((6,8))
  }
  it should "return correct output for sorted descending array" in {
    TwoSum.twoSum(Array(9,8,7,6,5,4,3,2,1), 16) shouldBe Some((0,2))
  }
  it should "return correct output for random order array" in {
    TwoSum.twoSum(Array(4,7,9,1,2,6,8,5,3), 16) shouldBe Some((1,2))
  }
}

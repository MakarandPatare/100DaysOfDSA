package Blind75.Array

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class MaximumSubarrayTest extends AnyFlatSpec with should.Matchers {
  it should "return 0 for empty array" in {
    MaximumSubarray.maxSubarraySum(Array()) shouldBe 0
  }
  it should "return 6 for example 1" in {
    MaximumSubarray.maxSubarraySum(Array(-2,1,-3,4,-1,2,1,-5,4)) shouldBe 6
  }
  it should "return 1 for example 2" in {
    MaximumSubarray.maxSubarraySum(Array(1)) shouldBe 1
  }
  it should "return 23 for example 3" in {
    MaximumSubarray.maxSubarraySum(Array(5,4,-1,7,8)) shouldBe 23
  }
}

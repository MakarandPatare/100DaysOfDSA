package Blind75.Array

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class MaximumProductSubarrayTest extends AnyFlatSpec with should.Matchers {
  it should "return 6 for example 1" in {
    MaximumProductSubarray.maximumProduct(Array(2,3,-2,4)) shouldBe 6
  }
  it should "return 0 for example 2" in {
    MaximumProductSubarray.maximumProduct(Array(-2,0,-1)) shouldBe 0
  }
}

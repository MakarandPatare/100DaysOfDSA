package Blind75.Array

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ProductOfArrayExceptSelfTest extends AnyFlatSpec with should.Matchers {
  it should "give correct output for example 1" in {
    ProductOfArrayExceptSelf.productUsingDivision(Array(1,2,3,4)) shouldBe Array(24,12,8,6)
    ProductOfArrayExceptSelf.productWithoutUsingDivision(Array(1,2,3,4)) shouldBe Array(24,12,8,6)
  }
  it should "give correct output for example 2" in {
    ProductOfArrayExceptSelf.productUsingDivision(Array(-1,1,0,-3,3)) shouldBe Array(0,0,9,0,0)
    ProductOfArrayExceptSelf.productWithoutUsingDivision(Array(-1,1,0,-3,3)) shouldBe Array(0,0,9,0,0)
  }

}

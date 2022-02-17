package Blind75.Array

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class FindMinimumInRotatedSortedArrayTest extends AnyFlatSpec with should.Matchers {
  it should "give correct output for example 1" in {
    FindMinimumInRotatedSortedArray.findMin(Array(3,4,5,1,2)) shouldBe 1
  }
  it should "give correct output for example 2" in {
    FindMinimumInRotatedSortedArray.findMin(Array(4,5,6,7,0,1,2)) shouldBe 0
  }
}

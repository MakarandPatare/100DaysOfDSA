package Blind75.Array

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SearchInRotatedSortedArrayTest extends AnyFlatSpec with should.Matchers {
  it should "return correct output for example 1" in {
    SearchInRotatedSortedArray.search(Array(4,5,6,7,0,1,2), 0) shouldBe 4
    SearchInRotatedSortedArray.search(Array(4,5,6,7,0,1,2), 3) shouldBe -1
  }
  it should "return correct output for example 2" in {
    SearchInRotatedSortedArray.search(Array(1), 0) shouldBe -1
  }
}

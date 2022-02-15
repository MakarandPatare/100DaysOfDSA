package Blind75.Array

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ContainerWithMostWaterTest extends AnyFlatSpec with should.Matchers {
  it should "return 49 for examplpe 1" in {
    ContainerWithMostWater.maxAmountOfWater(Array(1,8,6,2,5,4,8,3,7)) shouldBe 49
  }
  it should "return 1 for examplpe 2" in {
    ContainerWithMostWater.maxAmountOfWater(Array(1,1)) shouldBe 1
  }
  it should "return 0 for empty array" in {
    ContainerWithMostWater.maxAmountOfWater(Array()) shouldBe 0
  }
  it should "return 0 for single element array" in {
    ContainerWithMostWater.maxAmountOfWater(Array(8)) shouldBe 0
  }
}

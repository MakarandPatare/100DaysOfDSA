package Blind75.Array

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class BestTimeToBuyAndSellStockTest extends AnyFlatSpec with should.Matchers {
  it should "return 0 for empty input array" in {
    BestTimeToBuyAndSellStock.maxProfit(Array()) shouldBe 0
  }
  it should "give correct output for given example 1" in {
    BestTimeToBuyAndSellStock.maxProfit(Array(7,1,5,3,6,4)) shouldBe 5
  }
  it should "give 0 for given example 2" in {
    BestTimeToBuyAndSellStock.maxProfit(Array(7,6,4,3,1)) shouldBe 0
  }
}

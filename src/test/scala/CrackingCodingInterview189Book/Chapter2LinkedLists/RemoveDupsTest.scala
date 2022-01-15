package CrackingCodingInterview189Book.Chapter2LinkedLists

import scala.collection.mutable

import org.scalatest._
import flatspec._
import matchers._

class RemoveDupsTest extends AnyFlatSpec with should.Matchers {
  it should "return empty list as is" in {
    RemoveDups.removeDups(Nil) shouldBe Nil
  }
  it should "not modify list with no duplicate elements" in {
    RemoveDups.removeDups(List(1, 2, 3, 4, 9, 8, 7, 6)) shouldBe List(1, 2, 3, 4, 9, 8, 7, 6)
  }
  it should "remove duplicates from the list" in {
    RemoveDups.removeDups(List(1, 2, 6, 3, 4, 9, 2, 8, 7, 6)) shouldBe List(1, 2, 6, 3, 4, 9, 8, 7)
  }
}

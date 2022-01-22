package CrackingCodingInterview189Book.Chapter2LinkedLists

import scala.collection.mutable

import org.scalatest._
import flatspec._
import matchers._

class ReturnKthToLastTest extends AnyFlatSpec with should.Matchers {
  var list = ListNode(1)
  val head = list
  (2 to 10).map(i => {list.next = ListNode(i); list = list.next})
  list = head

  it should "return Nil when k is greater than length of the list" in {
    ReturnKthToLast.kthToLast(15, list) shouldBe 0
  }
  it should "return Nil when list is empty and k is 0" in {
    ReturnKthToLast.kthToLast(0, null) shouldBe 0
  }
  it should "return Nil when list is empty and k is 1" in {
    ReturnKthToLast.kthToLast(1, null) shouldBe 0
  }
  it should "return Nil when list is empty and k is greater than 0" in {
    ReturnKthToLast.kthToLast(3, null) shouldBe 0
  }
  it should "return last element when k is 1" in {
    ReturnKthToLast.kthToLast(1, list) shouldBe 10
  }
  it should "return 0 when k is 0" in {
    ReturnKthToLast.kthToLast(0, list) shouldBe 0
  }
  it should "return kth to last element when k is less than the length of string" in {
    ReturnKthToLast.kthToLast(6, list) shouldBe 5
  }
  it should "return first element when k is equal to length of the list" in {
    ReturnKthToLast.kthToLast(10, list) shouldBe 1
  }
}

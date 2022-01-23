package CrackingCodingInterview189Book.Chapter2LinkedLists

import org.scalatest._
import flatspec._
import matchers._

class DeleteMiddleNodeTest extends AnyFlatSpec with should.Matchers {
  // ToDo: Improve the tests
  var listNode1 = ListNode(1)
  var listNode2 = ListNode(2)
  var listNode3 = ListNode(3)
  var listNode4 = ListNode(4)
  var listNode5 = ListNode(5)
  listNode1.next = listNode2
  listNode2.next = listNode3
  listNode3.next = listNode4
  listNode4.next = listNode5

  it should "delete node 2 from this list" in {
    DeleteMiddleNode.deleteMiddleNode(listNode3)
    listNode3.next shouldBe listNode5
  }
}

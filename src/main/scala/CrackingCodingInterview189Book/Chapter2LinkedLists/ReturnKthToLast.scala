package CrackingCodingInterview189Book.Chapter2LinkedLists

import java.util
import scala.collection.mutable.ListBuffer

/**
 * Implement an algorithm to find the kth to last element of a singly linked list
 */

case class ListNode[T](xc: T) {
  var value: T = xc
  var next: ListNode[T] = null
}

object ReturnKthToLast {
  def kthToLast(k: Int, list: ListNode[Int]): Int = {
    var bigNode = list
    var smallNode = list
    if (k == 0) return 0
    for (i <- 0 until k)
      if (bigNode == null) return 0
      else bigNode = bigNode.next
    while (bigNode != null) {
      bigNode = bigNode.next
      smallNode = smallNode.next
    }
    smallNode.value
  }
}

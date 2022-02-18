package Blind75.LinkedList

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.



Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]


Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz


Follow up: Could you do this in one pass?

 */
object RemoveNthNodeFromEndOfTheList {
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
    if (head == null || (head.next == null && n == 1)) return null
    val dummy = new ListNode(0)
    dummy.next = head
    var firstP = dummy
    var secondP = dummy
    for (i <- 1 to n + 1) {
      firstP = firstP.next
    }
    while (firstP != null) {
      firstP = firstP.next
      secondP = secondP.next
    }
    secondP.next = secondP.next.next
    dummy.next
  }
}

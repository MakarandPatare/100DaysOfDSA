package CrackingCodingInterview189Book.Chapter2LinkedLists

/**
 * Implement an algorithm to delete a node in the middle (i.e. any node but the first and last node, not necessarily the
 * exact middle) of a singly linked list, given only access to that node.
 * Example:
 * Input - The node c from linked List a -> b -> c -> d -> e -> f
 * Result = nothing is returned, but the new linked list looks like a -> b -> d -> e -> f
 */

object DeleteMiddleNode {
  def deleteMiddleNode(node: ListNode[Int]) = {
    if (node == null || node.next == null) println("Node is not from middle")
    node.value = node.next.value
    node.next = node.next.next
    println("Deleted the middle node")
  }
}
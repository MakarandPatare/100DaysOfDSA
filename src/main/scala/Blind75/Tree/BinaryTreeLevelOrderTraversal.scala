package Blind75.Tree

/**
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []


Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000

 */

/**
 * Definition for a binary tree node.
 */

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}

import scala.collection.mutable.Queue
import scala.collection.mutable.ListBuffer
object Solution {
  def levelOrder(root: TreeNode): List[List[Int]] = {
    val queue = Queue.empty[TreeNode]
    val output = ListBuffer[List[Int]]()
    if (root != null) queue += root

    while (queue.nonEmpty) {
      val currLevelVisits = ListBuffer[Int]()
      for (i <- 0 until queue.length) {
        val curNode = queue.dequeue
        currLevelVisits += curNode.value
        if (curNode.left != null) queue += curNode.left
        if (curNode.right != null) queue += curNode.right
      }
      output += currLevelVisits.toList
    }
    output.toList
  }
}
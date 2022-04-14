package Blind75.Tree

/**
 * Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2


Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100
 */

/**
 * Definition for a binary tree node.
 */
class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}

import scala.collection.mutable.Stack
object MaximumDepthOfBinaryTree {
  def maxDepth(root: TreeNode): Int = {
    //Short solution but not tail recursive
    if (root == null) 0
    else math.max(maxDepth(root.left), maxDepth(root.right)) + 1

    //      BFS solution
    //         var rootM = root
    //         val stack: Stack[TreeNode] = Stack[TreeNode]()
    //         val depths: Stack[Int] = Stack[Int]()

    //         if (rootM == null) return 0
    //         stack += rootM
    //         depths += 1

    //         var (depth, currentDepth) = (0, 0)

    //         while(stack.nonEmpty) {
    //             rootM = stack.pop
    //             currentDepth = depths.pop
    //             if(rootM != null) {
    //                 depth = math.max(depth, currentDepth)
    //                 stack += rootM.left += rootM.right
    //                 depths += currentDepth + 1 += currentDepth + 1
    //             }
    //         }
    //         depth
  }
}

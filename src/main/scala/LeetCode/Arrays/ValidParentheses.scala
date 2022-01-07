package LeetCode.Arrays

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */

import scala.collection.mutable.Stack

object ValidParentheses {
  def isValid(s: String): Boolean = {
    val mappings = Map(')' -> '(', '}' -> '{', ']' -> '[')
    val stack: Stack[Character] = Stack[Character]()
    for (i <- 0 until s.length) {
      if (mappings.contains(s(i))) {
        val top = if (stack.isEmpty) '#' else stack.pop()
        if (mappings(s(i)) != top)
          return false
      } else
        stack.push(s(i))
    }
    stack.isEmpty
  }
}

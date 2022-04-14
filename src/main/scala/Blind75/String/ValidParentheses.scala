package Blind75.String

import scala.collection.mutable

object ValidParentheses {
  def isValid(s: String): Boolean = {
    val mappings = Map(')' -> '(', '}' -> '{', ']' -> '[')
    val stack: mutable.Stack[Character] = new mutable.Stack[Character]()
    for (i <- 0 until s.length) {
      if (mappings.contains(s(i))) {
        if (stack.isEmpty || mappings(s(i)) != stack.pop())
          return false
      } else
        stack.push(s(i))
    }
    stack.isEmpty
  }
}

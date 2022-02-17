package Blind75.String

object ValidParentheses {
  def isValid(s: String): Boolean = {
    val mappings = Map(')' -> '(', '}' -> '{', ']' -> '[')
    val stack: Stack[Character] = new Stack[Character]()
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

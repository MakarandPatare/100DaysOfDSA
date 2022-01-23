package CrackingCodingInterview189Book.Chapter2LinkedLists

case class ListNode[T](x: T) {
  var value: T = x
  var next: ListNode[T] = null
}

package CrackingCodingInterview189Book.Chapter2LinkedLists

import scala.collection.mutable
import scala.collection.mutable.ListBuffer


/**
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP: How would you solve this problem if a temporary buffer is not allowed?
 */
object RemoveDups {
  def removeDups(list: List[Int]): List[Int] = {
    val set = new mutable.HashSet[Int]()
    list.filter(e => {
      if (set.contains(e))
        false
      else {
        set.add(e)
        true
      }
    })
  }
}

package Blind75.Interval

/**
 * Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.

 

Example 1:

Input: intervals = [[0,30],[5,10],[15,20]]
Output: 2
Example 2:

Input: intervals = [[7,10],[2,4]]
Output: 1
 

Constraints:

1 <= intervals.length <= 104
0 <= starti < endi <= 106
 */

object MeetingRoomsII {
  def minMeetingRooms(intervals: Array[Array[Int]]): Int = {
    import scala.collection.mutable.PriorityQueue

    if (intervals.length == 0) return 0

    val sIntervals = intervals.sortBy(_(0))
    def reverseIntOrder(i: Int) = - i
    val pQueue: PriorityQueue[Int] = PriorityQueue.empty[Int](Ordering.by(reverseIntOrder))
    //OR ((a,b) => b - a)
    pQueue += sIntervals(0)(1)

    for (i <- 1 until sIntervals.length) {
      if (sIntervals(i)(0) >= pQueue.head) {
        pQueue.dequeue
      }
      pQueue += sIntervals(i)(1)
    }
    pQueue.length
  }
}

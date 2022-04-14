package Blind75.Interval

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

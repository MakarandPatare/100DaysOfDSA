package Blind75.Interval

/**
 * Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person could attend all meetings.



Example 1:

Input: intervals = [[0,30],[5,10],[15,20]]
Output: false
Example 2:

Input: intervals = [[7,10],[2,4]]
Output: true


Constraints:

0 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti < endi <= 106
 */
object MeetingRooms {
  def canAttendMeetings(intervals: Array[Array[Int]]): Boolean = {
    val sortedIntervals = intervals.sortBy(_.head)
    for (i <- 0 until sortedIntervals.length - 1)
      if (sortedIntervals(i)(1) > sortedIntervals(i + 1)(0))
        return false
    return true
  }
}

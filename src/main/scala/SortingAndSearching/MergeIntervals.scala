package SortingAndSearching

/**
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.



Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.


Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
 */

object MergeIntervals {
  def merge(intervals: Array[Array[Int]]): Array[Array[Int]] = {
    def loop(ints: List[Array[Int]], acc: List[Array[Int]]): List[Array[Int]] = ints match {
      case Nil => acc
      case x::Nil => acc :+ x
      case x::y::tail =>
        if (x(1) >= y(0))
          loop(Array(x(0), Math.max(x(1), y(1))) :: tail, acc)
        else
          loop(y::tail, acc :+ x)
    }
    loop(intervals.sortBy(_(0)).toList, List()).toArray
  }
}

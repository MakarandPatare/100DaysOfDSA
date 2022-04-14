package Blind75.Heap

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]

Constraints:
1 <= nums.length <= 105
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
object TopKFrequentElements {
  def topKFrequent(nums: Array[Int], k: Int): Array[Int] = {
    import scala.collection.mutable.PriorityQueue
    val pq: PriorityQueue[(Int, Int)] = PriorityQueue.empty[(Int, Int)]({ case ((a1, b1), (a2, b2)) => b2 - b1})
    for (num <- nums.groupBy(num => num)) {
      pq += ((num._1, num._2.length))
      if (pq.length > k) pq.dequeue
    }
    val op = new Array[Int](k)
    for (i <- 0 until k) {
      op(i) = pq.dequeue._1
    }
    op
  }
}

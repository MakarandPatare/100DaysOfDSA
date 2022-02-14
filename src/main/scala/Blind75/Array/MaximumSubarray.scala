package Blind75.Array

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23


Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104


Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

object MaximumSubarray {
  def maxSubarraySum(nums: Array[Int]): Int = {
    if (nums.isEmpty) 0
    else {
      var currentSum = nums(0)
      var maxSum = nums(0)
      for (i <- 1 until nums.length) {
        currentSum = math.max(nums(i), nums(i) + currentSum)
        maxSum = math.max(maxSum, currentSum)
      }
      maxSum
    }
  }
}

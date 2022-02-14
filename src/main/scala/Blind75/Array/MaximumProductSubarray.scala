package Blind75.Array

/**
 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.



Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.


Constraints:

1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */
object MaximumProductSubarray {
  def maximumProduct(nums: Array[Int]): Int = {
    if (nums.length == 0) return 0
    var max = nums(0)
    var min = nums(0)
    var result = max
    //2,3,-2,4
    for (i <- 1 until nums.length) {
      val tempMax = math.max(nums(i), math.max(max * nums(i), min * nums(i)))
      min = math.min(nums(i), math.min(max * nums(i), min * nums(i)))
      max = tempMax
      result = math.max(max, result)
    }
    result
  }
}
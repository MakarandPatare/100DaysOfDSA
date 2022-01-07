package LeetCode.DynamicProgramming

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
  def maxProduct(nums: Array[Int]): Int = {
    var max = Int.MinValue
    var product = 1
    var fProduct = 1
    var bProduct = 1

    for (i <- 1 to nums.length) {
      fProduct *= nums(i-1)
      bProduct *= nums(nums.length - i)
      max = Math.max(fProduct, max)
      max = Math.max(bProduct, max)
      if (fProduct == 0) fProduct = 1
      if (bProduct == 0) bProduct = 1
    }
    max
  }
}
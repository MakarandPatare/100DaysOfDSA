package Blind75.Array

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.


Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 */
object ProductOfArrayExceptSelf {
  // Solution 1: Using division - Not allowed in most interviews
  def productUsingDivision(nums: Array[Int]): Array[Int] = {
    val numOfZeroes = nums.count(_ == 0)
    val product = nums.filterNot(_ == 0).fold(1)(_ * _)
    nums.map(num =>
      if (num == 0)
        if (numOfZeroes > 1) 0 else product
      else
        if (numOfZeroes > 0) 0 else product / num)
  }

  def productWithoutUsingDivision(nums: Array[Int]): Array[Int] = {
    val productUntil = new Array[Int](nums.length)
    var productRight = 1
    val resultArray = new Array[Int](nums.length)
    productUntil(0) = 1
    for (i <- 1 until nums.length) {
      productUntil(i) = productUntil(i - 1) * nums(i - 1)
    }
    for (i <- nums.length - 1 to 0 by -1) {
      resultArray(i) = productUntil(i) * productRight
      productRight *= nums(i)
    }
    resultArray
  }

}

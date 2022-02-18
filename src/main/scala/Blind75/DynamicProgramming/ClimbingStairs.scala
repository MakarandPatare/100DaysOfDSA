package Blind75.DynamicProgramming

/**
 * You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


Constraints:

1 <= n <= 45
 */
class ClimbingStairs {
  def climbStairsBottomUp(n: Int): Int = {
    if (n == 1 || n == 2) n
    else {
      val dp = new Array[Int](n + 1)
      dp(1) = 1
      dp(2) = 2
      for (i <- 3 to n)
        dp(i) = dp(i - 1) + dp(i - 2)
        dp(n)
    }
    dp(n)
  }
  // Top down call dp(n)
//  def dp(n: Int): Int = {
//    val memo = new HashMap[Int, Int]()
//    if (n <= 2) n
//    else {
//      if (!memo.contains(n))
//        memo.put(n, dp(n - 1) + dp(n - 2))
//      memo(n)
//    }
//  }
}

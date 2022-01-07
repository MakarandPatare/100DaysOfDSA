package LeetCode.Arrays

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [0]
Output: [1]
Explanation: The array represents the integer 0.
Incrementing by one gives 0 + 1 = 1.
Thus, the result should be [1].
Example 4:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].


Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
 */
object PlusOne {
  def plusOne(digits: Array[Int]): Array[Int] = {
    def loop(reverseD: List[Int], carry: Boolean, acc: List[Int]): Array[Int] = reverseD match {
      case Nil => if (carry) (acc :+ 1).toArray.reverse else acc.toArray.reverse
      case x::xs => if (carry && x + 1 == 10) loop(xs, true, acc :+ 0)
      else if (carry) loop(xs, false, acc :+ (x + 1))
      else loop(xs, false, acc :+ x)
    }
    loop(digits.reverse.toList, true, List())
  }
}
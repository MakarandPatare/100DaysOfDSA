package Arrays

/**
 * 3. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */

import scala.collection.mutable.HashMap
object LongestSubstringWithoutRepeatingCharacters {
  def lengthOfLongestSubstring(s: String): Int = {
    val n = s.length()
    var ans = 0;
    val map: HashMap[Character, Integer] = new HashMap[Character, Integer]()
    var i = 0
    for (j <- 0 until n) {
      if (map.contains(s(j))) {
        i = Math.max(map.get(s(j)).get, i)
      }
      ans = Math.max(ans, j - i + 1)
      map.put(s(j), j + 1)
    }
    ans
  }
}

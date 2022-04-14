package Blind75.String

/**
 *Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters.
 */

object LongestPalindromicSubstring {
  def longestPalindrome(s: String): String = {
    if (s == "" || s.length == 0) ""
    var start = 0
    var end = 0
    var len = 0
    var len1 = 0
    var len2 = 0
    for (i <- 0 until s.length) {
      len1 = expand (s, i, i)
      len2 = expand (s, i, i+1)
      len = Math.max(len1, len2)

      if (len > end - start) {
        start = i - (len - 1)/2
        end = i + len/2
      }
    }
    s.substring(start, end + 1)
  }

  def expand (s: String, left: Int, right: Int): Int = {
    var l = left
    var r = right
    while (l >= 0 && r < s.length && s(l) == s(r)) {
      l = l - 1
      r = r + 1
    }
    r - l - 1
  }
}

package Blind75.String

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false


Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 Answer: Already did for ASCII. For Unicode, we won't have the size limit.
 */
object ValidAnagram {
  def isAnagram(s: String, t: String): Boolean = {
    // one line solution
    // s.sorted == t.sorted T: O(nlogn), S: O(1)

    // More efficient solution T: O(n), S: O(1)
    if (s.length != t.length) return false

    val table = new Array[Int](128)
    for (i <- 0 until s.length)
      table(s(i)) += 1 // or table(s(i) - 'a') += 1 for 26 char
    for (i <- 0 until t.length) {
      table(t(i)) -= 1
      if (table(t(i)) < 0) return false
    }
    return true
  }
}

package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

/**
 * Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, s1 and s2,
 * write code to check if s2 is a rotation of s1 using only one call to isSubstring
 * Example: "waterbottle" is a rotation of "erbottlewat"
 */
object StringRotation {
  // Using contains instead of isSubstring
  def stringRotation(s1: String, s2: String): Boolean =
    if (s1.length != s2.length || s1.length == 0) false
    else (s1+s1).contains(s2)
}

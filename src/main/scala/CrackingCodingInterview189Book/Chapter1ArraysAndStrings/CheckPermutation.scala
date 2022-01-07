package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

/**
 * Given two strings, write a method to decide if one is a permutation of the other
 */
object CheckPermutation {
  /** Assumptions:
   * 1. Strings are ASCII
   * 2. Comparison is case sensitive
   * 3. Whitespaces are not ignored
   */

  def checkPermutation(str1: String, str2: String): Boolean = {
    // Solution 1: str1.sorted == str2.sorted
    // Solution 2:
    if (str1.length != str2.length) return false
    val letterCount = new Array[Int](128)
    for (s <- str1) {
      letterCount(s) += 1
    }
    for (s <- str2) {
      letterCount(s) -= 1
      if (letterCount(s) < 0) return false
    }
    return true
  }
}

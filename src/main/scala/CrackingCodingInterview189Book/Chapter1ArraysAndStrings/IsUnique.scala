package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */

object IsUnique {
  def isUnique(s: String): Boolean = {
    if (s == "" || s.length > 128)
      return false
    else {
      // Assumption: String is ASCII (So, only 128 different characters possible)
      // HashMap along with lookup can also be used instead of an array of Boolean
      val charSet = new Array[Boolean](128)
      for (char <- s) {
        if (charSet(char) == true)
          return false
        charSet(char) = true
      }
    }
    return true
  }
}

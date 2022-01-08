package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space
 * at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: If
 * implementing in Java, please use a character array so that you can perform this operation in place.)
 * Example:
 * Input: "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 */
object URLify {
  def urlIfy(s: Array[Char], trueLength: Int): Array[Char] = {
    if (s.isEmpty) return s
    // Assuming length is accurate. Otherwise, we need to calculate number of spaces first for knowing the pointerFromEnd
    var pointerFromEnd = s.length - 1
    for (cp <- trueLength - 1 to 0 by -1) {
      if (s(cp) == ' ') {
        s(pointerFromEnd) = '0'
        s(pointerFromEnd - 1) = '2'
        s(pointerFromEnd - 2) = '%'
        pointerFromEnd -= 3
      } else {
        s(pointerFromEnd) = s(cp)
        pointerFromEnd -= 1
      }
    }
    s
  }
}

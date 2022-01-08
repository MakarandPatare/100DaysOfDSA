package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

/**
 * Implement a method to perform basic string compression using the counts of repeated characters. For example, the
 * string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original
 * string, your method should return the original string. You can assume the string has only uppercase and lowercase
 * letters (a-z)
 */
object StringCompression {
  def stringCompression(str: String): String = {
    if (str.length == 0) return str
    var curChar = str.head
    var charCounter = 0
    var compressedList = new StringBuilder("")
    for (i <- 0 until str.length) {
      if (str(i) == curChar) {
        charCounter += 1
      } else {
        compressedList ++= s"$curChar$charCounter"
        curChar = str(i)
        charCounter = 1
      }
    }
    // For the last character
    compressedList ++= s"$curChar$charCounter"
    val resultString = compressedList.toString
    if (resultString.length < str.length)
      resultString
    else str
  }
}

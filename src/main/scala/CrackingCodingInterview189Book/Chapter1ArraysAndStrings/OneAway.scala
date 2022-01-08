package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

/**
 * There are three types of edits that can be performed on strings: Insert a character, remove a character, or replace
 * a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
 * Example:
 * pale,  ple  -> true
 * pales, pale -> true
 * pale,  bale -> true
 * pale,  bake -> false
 */
trait SkipOrReplace
object Skip extends SkipOrReplace
object Replace extends SkipOrReplace

object OneAway {
  def oneAway(str1: String, str2: String): Boolean = {
    if (str1.length == str2.length)
      oneAwayComparison(str1, str2, Replace)
    else if (Math.abs(str1.length - str2.length) == 1)
      oneAwayComparison(str1, str2, Skip)
    else false
  }

  def oneAwayComparison(str1: String, str2: String, skipOrReplace: SkipOrReplace): Boolean = {
    var p1 = 0
    var p2 = 0
    var skippedOrReplaced = false
    while (p1 < str1.length && p2 < str2.length) {
      if (str1(p1) == str2(p2))
        p1 += 1; p2 += 1
      else if (str1(p1) != str2(p2) && !skippedOrReplaced) {
        skippedOrReplaced = true
        skipOrReplace match
          case Replace => p1 += 1; p2 += 1
          case Skip => if (str1.length > str2.length) p1 += 1 else p2 += 1
      } else return false
    }
    true
  }
}

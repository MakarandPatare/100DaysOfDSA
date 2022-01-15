package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

import scala.collection.mutable

/**
 * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase
 * that is the same forwards and backwards. A permutation os a rearrangement of letters. The palindrome does not need
 * to be limited to just dictionary words. You can ignore casing and non-letter characters.
 * Example:
 * Input:  "Tact Coa"
 * Output: True (Permutations: "taco cat", "atco cta", etc.)
 */
object PalindromePermutation {
  // Assumption: Case and Spaces should be ignored
  def palindromePermutation(s: String): Boolean = {
    // Another approach is adding elements to HashMap[Char, Int] where we need to make sure at most one element has odd count
    // HashSet approach is more performant as it saves us from the unnecessary iteration through HashMap.
    val set = new mutable.HashSet[Char]()
    for (c <- s)
      if (c != ' ')
        if (set.contains(c.toLower)) set.remove(c.toLower) else set.add(c.toLower)
    if (List(0, 1).contains(set.size)) true else false
  }
}

package Blind75.String

object ValidPalindrome {
  def isPalindrome(s: String): Boolean = {
    var fp = 0
    var bp = s.length - 1
    while(fp < bp) {
      while (fp < bp && !Character.isLetterOrDigit(s(fp)))
        fp +=1
      while (fp < bp && !Character.isLetterOrDigit(s(bp)))
        bp -=1
      if (s(fp).toLower != s(bp).toLower)
        return false
      fp +=1
      bp -=1
    }
    return true
  }
}

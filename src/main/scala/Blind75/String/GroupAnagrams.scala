package Blind75.String

class GroupAnagrams {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    if (strs.length == 0) return new ArrayList()
    val ans: Map[String, List] = new HashMap[String, List]()
    // Assuming just 26 characters
    val count = new Array[Int](26)
    for (str <- strs) {
      count = Array.fill(0)

      for (c <- str) count(c - 'a') += 1

      val sb = new StringBuilder("")
      for (i <- 0 until 128) {
        sb.append('#')
        sb.append(count(i))
      }
      val key: String = sb.toString
      if (!ans.containsKey(key)) ans.put(key, new ArrayList());
      ans.get(key).add(s);
    }
    new ArrayList(ans.values());
  }
}

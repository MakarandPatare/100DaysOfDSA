package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0
 */

object ZeroMatrix {
  def zeroMatrix(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    if (matrix.length == 0 || matrix(0).length == 0) return matrix
    val horZeroSet = scala.collection.mutable.Set.empty[Int]
    val verZeroSet = scala.collection.mutable.Set.empty[Int]
    for (i <- 0 until matrix.length; j <- 0 until matrix(0).length)
      if (matrix(i)(j) == 0) {
        horZeroSet.add(i)
        verZeroSet.add(j)
      }
    for (h <- horZeroSet)
      for (j <- 0 until matrix(0).length)
        matrix(h)(j) = 0
    for (v <- verZeroSet)
      for (i <- 0 until matrix.length)
        matrix(i)(v) = 0
    matrix
  }
}

package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

/**
 * Given an image represented by an NxN matrix. where each pixel in the image is represented by an integer, write a
 * method to rotate the image by 90 degrees. Can you do this in place?
 */
object RotateMatrix {
  def rotateMatrix(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    if (matrix.length == 0 || matrix(0).length == 0) return matrix
    for (layer <- 0 until matrix.length/2) {
      val first = layer
      val last = matrix.length - 1 - layer
      for (i <- first until last) {
        val offset = i - first
        val top = matrix(first)(i) // Save top
        matrix(first)(i) = matrix(last - offset)(first) // top = left
        matrix(last - offset)(first) = matrix(last)(last - offset) // left = bottom
        matrix(last)(last - offset) = matrix(i)(last) // bottom = right
        matrix(i)(last) = top // right = top
      }
    }
    matrix
  }
}

package Blind75.Matrix

/**
 * Given an m x n matrix, return all elements of the matrix in spiral order.



Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
 */
object SpiralMatrix {
  def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {
    var result = ListBuffer[Int]()
    val rows = matrix.length
    val columns = matrix(0).length
    var up = 0
    var left = 0
    var right = columns - 1
    var down = rows - 1

    while (result.length < rows * columns) {
      for (col <- left to right)
        result.addOne(matrix(up)(col))
      for (row <- up + 1 to down)
        result.addOne(matrix(row)(right))
      if (down != up)
        for (col <- right - 1 to left by -1)
          result.addOne(matrix(down)(col))
      if (left != right)
        for (row <- down - 1 until up by -1)
          result.addOne(matrix(row)(left))
      left += 1
      right -= 1
      up += 1
      down -= 1
    }
    result.toList
  }
}

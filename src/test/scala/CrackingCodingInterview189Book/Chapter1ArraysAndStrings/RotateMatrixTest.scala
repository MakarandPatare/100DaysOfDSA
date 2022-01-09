package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

import org.scalatest._
import flatspec._
import matchers._

class RotateMatrixTest extends AnyFlatSpec with should.Matchers {
  it should "return rotate 2x2 matrix" in {
    Assertions.assert(RotateMatrix.rotateMatrix(Array(Array(1, 2),Array(3, 4))) === Array(Array(3, 1),Array(4, 2)))
  }
  it should "return rotate 3x3 matrix" in {
    Assertions.assert(RotateMatrix.rotateMatrix(Array(Array(1, 2, 3),Array(4, 5, 6),Array(7, 8, 9))) ===
    Array(Array(7, 4, 1),Array(8, 5, 2),Array(9, 6, 3)))
  }
  it should "return rotate 4x4 matrix" in {
    Assertions.assert(RotateMatrix.rotateMatrix(Array(Array(1, 2, 3, 4),Array(5, 6, 7, 8),Array(9, 10, 11, 12),Array(13, 14, 15, 16)))
      === Array(Array(13, 9, 5, 1), Array(14, 10, 6, 2), Array(15, 11, 7, 3), Array(16, 12, 8, 4)))
  }
}

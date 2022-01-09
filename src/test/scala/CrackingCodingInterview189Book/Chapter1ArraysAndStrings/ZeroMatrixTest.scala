package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

import org.scalatest._
import flatspec._
import matchers._

class ZeroMatrixTest extends AnyFlatSpec with should.Matchers {
  it should "return matrix as is for 2x2 matrix with no 0" in {
    Assertions.assert(ZeroMatrix.zeroMatrix(Array(Array(1,2),Array(3,4))) === Array(Array(1,2),Array(3,4)))
  }
  it should "return matrix as is for 2x3 matrix with no 0" in {
    Assertions.assert(ZeroMatrix.zeroMatrix(Array(Array(1,2,3),Array(4,5,6))) === Array(Array(1,2,3),Array(4,5,6)))
  }
  it should "return matrix as is for 3x3 matrix with no 0" in {
    Assertions.assert(ZeroMatrix.zeroMatrix(Array(Array(1,2,3),Array(4,5,6),Array(7,8,9))) ===
      Array(Array(1,2,3),Array(4,5,6),Array(7,8,9)))
  }
  it should "return modified output for 2x2 matrix with one 0" in {
    Assertions.assert(ZeroMatrix.zeroMatrix(Array(Array(1,2),Array(3,0))) === Array(Array(1,0),Array(0,0)))
  }
  it should "return modified output for 2x2 matrix with two 0s" in {
    Assertions.assert(ZeroMatrix.zeroMatrix(Array(Array(1,0),Array(3,0))) === Array(Array(0,0),Array(0,0)))
  }
  it should "return modified output for 2x3 matrix with one 0" in {
    Assertions.assert(ZeroMatrix.zeroMatrix(Array(Array(1,2,3),Array(4,0,6))) === Array(Array(1,0,3),Array(0,0,0)))
  }
  it should "return modified output for 3x3 matrix with one 0" in {
    Assertions.assert(ZeroMatrix.zeroMatrix(Array(Array(1,2,3),Array(4,5,6),Array(0,8,9))) ===
      Array(Array(0,2,3),Array(0,5,6),Array(0,0,0)))
  }
  it should "return modified output for 3x3 matrix with two 0s" in {
    Assertions.assert(ZeroMatrix.zeroMatrix(Array(Array(1,2,0),Array(4,5,6),Array(0,8,9))) ===
      Array(Array(0,0,0),Array(0,5,0),Array(0,0,0)))
  }
}

package CrackingCodingInterview189Book.Chapter1ArraysAndStrings

import org.scalatest._
import flatspec._
import matchers._

class IsUniqueTest extends AnyFlatSpec with should.Matchers {
  it should "return false for empty string" in {
    IsUnique.isUnique("") shouldBe false
  }
  it should "return false for string length more than 128" in {
    IsUnique.isUnique("aaadgdkgmdflsdfslksdfldkgdslfskdffdkgdsflskdfldfksdlfksdlgkdflskfsgpofdkgvdfpvmdpkfgmfdbpdfkfsdpflksdglpdfksdpfokgpdofkvdpokfsdf") shouldBe false
  }
  it should "return true for string abcdefghijklmnopqrstuvwxyz1234567890" in {
    IsUnique.isUnique("abcdefghijklmnopqrstuvwxyz1234567890") shouldBe true
  }
  it should "return false for string abcdefghijklmnopqrstuvwxsyz1234567890" in {
    IsUnique.isUnique("abcdefghijklmnopqrstuvwxsyz1234567890") shouldBe false
  }
  it should "return true for string abcdefghijklmnopqrstuvwxyz1234567890,./;'[]=-()|}{:?>\"" in {
    IsUnique.isUnique("abcdefghijklmnopqrstuvwxyz1234567890,./;'[]=-()|}{:?>\"") shouldBe true
  }
  it should "return true for string abcdefghijklmnopqrstuvwxyzABCDE1234567890" in {
    IsUnique.isUnique("abcdefghijklmnopqrstuvwxyzABCDE1234567890") shouldBe true
  }
}

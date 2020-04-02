package example

import org.scalacheck.Gen
import SolutionTest._

class SolutionSpec extends MyBaseSpec {
  "doIt" should "work for small numbers" in {
    Solution.doIt(0) shouldEqual -1
  }

  "doIt" should "work for large numbers" in {
    Solution.doIt(1000000000) shouldEqual BigInt(-1)
  }

  "doIt" should "not fail for random inputs" in {
    forAll(smallInteger, minSuccessful(100)) { limit: Int =>
     Solution.doIt(limit) shouldEqual -1
    }
  }
}

object SolutionTest {
  val smallInteger = Gen.choose(1,2000000)
}

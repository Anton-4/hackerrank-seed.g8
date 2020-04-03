package example

import org.scalacheck.Gen
import SolutionTest._

class SolutionSpec extends MyBaseSpec {
  "doIt" should "work for small numbers" in {
    Solution.doIt(0) shouldEqual -1
  }

  "doIt" should "work for large numbers" in {
    Solution.doIt(maxLimit) shouldEqual -1
  }

  "doIt" should "not fail for random inputs" in {
    forAll(testRange, minSuccessful(100)) { limit: Long =>
     Solution.doIt(limit) shouldEqual -1
    }
  }
}

object SolutionTest {
  val maxLimit = ("1E12").toDouble.longValue
  val testRange = Gen.choose(10,maxLimit)

  //adapted from biercoff.com/easily-measuring-code-execution-time-in-scala/
  def time[R](block: => R, name: String): R = {
    val tStart = System.nanoTime()
    val result = block
    val tEnd = System.nanoTime()
    println(name + " Elapsed time: " + (tEnd - tStart) + "ns")
    result
  }
}

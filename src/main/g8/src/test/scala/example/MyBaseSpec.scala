package example

import org.scalatest.{BeforeAndAfterAll, FlatSpec, Matchers}
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

trait MyBaseSpec extends FlatSpec with Matchers with BeforeAndAfterAll with ScalaCheckDrivenPropertyChecks {

}

import org.scalatest.{FunSuite, Matchers}

class HelloWorldTest extends FunSuite with Matchers {

  test("Multiplication"){
    val result = HelloWorld.multiply(3, 4)
    result shouldBe 12
  }

}

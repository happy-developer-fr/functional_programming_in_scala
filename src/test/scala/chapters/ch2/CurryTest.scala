package chapters.ch2

class CurryTest extends org.scalatest.FunSuite {

  test(" curry f(A,B) => A + B") {
    val curry: Curry = new Curry
    val printSumToFunction = curry.curry((a: Int, b: Int) => "sum %d".format(a + b))
    val sumFourtyOne = printSumToFunction(40)(1)
    assert(sumFourtyOne.equals("sum 41"))
  }

  test("uncurry ") {
    val curry: Curry = new Curry
    val mult = (a: Int, b: Int) => a * b
    val printSum = curry.uncurry[Int, Int, String](a => b => "%d".format(mult(a, b)))
    assert(printSum(12, 2) === "24")
  }
}

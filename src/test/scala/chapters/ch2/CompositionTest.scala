package chapters.ch2

class CompositionTest extends org.scalatest.FunSuite {

  test("2 * (1 + 3) = 8") {
    val composition: Composition = new Composition
    val cross2: Int => Int = a => a * 2
    val plus3: Int => Int = a => a + 3
    assert(composition.compose[Int, Int, Int](cross2, plus3)(1) === 8)
  }

  test("1 * 2 + 3) = 5") {
    val composition: Composition = new Composition
    val cross2: Int => Int = a => a * 2
    val plus3: Int => Int = a => a + 3
    assert(composition.compose[Int, Int, Int](plus3, cross2)(1) === 5)
  }

  test("f(a => print(a)), g(a => 2*a) => a => 2a") {
    val composition: Composition = new Composition
    val print: Int => String = a => "%d".format(a)
    val mult: Int => Int = b => b * 2
    assert(composition.compose[Int, Int, String](print, mult)(1) === "2")
  }
}

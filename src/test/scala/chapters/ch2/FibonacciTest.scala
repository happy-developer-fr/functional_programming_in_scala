package chapters.ch2

class FibonacciTest extends org.scalatest.FunSuite {

  test("fibonacci of 0  is 0"){
    val fib: Fibonacci = new Fibonacci
    assert(fib.fib(0) === 0 )
  }

  test("fibonacci of 1  is 1"){
    val fib: Fibonacci = new Fibonacci
    assert(fib.fib(1) === 1 )
  }

  test("fibonacci of 2  is 1"){
    val fib: Fibonacci = new Fibonacci
    assert(fib.fib(2) === 1 )
  }

  test("fibonacci of 3  is 2"){
    val fib: Fibonacci = new Fibonacci
    assert(fib.fib(3) === 2)
  }

  test("fibonacci of 4  is 3"){
    val fib: Fibonacci = new Fibonacci
    assert(fib.fib(4) === 3)
  }

  test("fibonacci of 5  is 5"){
    val fib: Fibonacci = new Fibonacci
    assert(fib.fib(5) === 5)
  }
}

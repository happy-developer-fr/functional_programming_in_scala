package chapters.ch2

import scala.annotation.tailrec

class Fibonacci {
  def main(args: Array[String]): Unit = {

  }

  def fib(n: Int): Int = {

    @tailrec
    def loop(n: Int, prev: Int, current: Int): Int = {
      if (n == 0) prev
      else loop(n - 1, current, prev + current)
    }

    loop(n, 0, 1)
  }
}

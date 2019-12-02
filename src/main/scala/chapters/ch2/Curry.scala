package chapters.ch2

class Curry {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    a => b => f(a, b)
  }

  def uncurry[A, B, C](f: (A => B => C)): (A, B) => C = {
    (a, b) => f(a)(b)
  }
}

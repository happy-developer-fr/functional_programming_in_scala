package chapters.ch2

import scala.annotation.tailrec

class IsSorted {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @tailrec
    def go(len: Int, element: A, array: Array[A]): Boolean = {
      if (len <= 1) true
      else {
        ordered(element, array.head) && go(len - 1, array.head, array.tail)
      }
    }

    go(as.length, as.head, as.tail)
  }

  def isSorted2[A](as: Array[A], gt: (A, A) => Boolean): Boolean = {
    @tailrec
    def go(n: Int): Boolean = {
      if (n >= as.length -1) true
      else if (gt(as(n), as(n + 1))) false
      else go(n + 1)
    }

    go(0)
  }
}

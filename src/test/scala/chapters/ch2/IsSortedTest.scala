package chapters.ch2

class IsSortedTest extends org.scalatest.FunSuite {

  test("is sorted 1 3 2 4 is false") {
    val sorted: IsSorted = new IsSorted
    assert(sorted.isSorted(Array(1, 3, 2, 4), (a: Int, b: Int) => a <= b) === false)
  }

  test("is sorted 1 2 3 4 is true") {
    val sorted: IsSorted = new IsSorted
    assert(sorted.isSorted(Array(1, 2, 3, 4), (a: Int, b: Int) => a <= b) === true)
  }

  test("is sorted A B D C is false") {
    val sorted: IsSorted = new IsSorted
    assert(sorted.isSorted(Array("A", "B", "D", "C"), (a: String, b: String) => a <= b) === false)
  }

  test("is sorted A B C D is false") {
    val sorted: IsSorted = new IsSorted
    assert(sorted.isSorted(Array("A", "B", "C", "D"), (a: String, b: String) => a <= b) === true)
  }

  test("is sorted2 1 3 2 4 is false") {
    val sorted: IsSorted = new IsSorted
    assert(sorted.isSorted2(Array(1, 3, 2, 4), (a: Int, b: Int) => a > b) === false)
  }

  test("is sorted2 1 2 3 4 is true") {
    val sorted: IsSorted = new IsSorted
    assert(sorted.isSorted2(Array(1, 2, 3, 4), (a: Int, b: Int) => a > b) === true)
  }

  test("is sorted2 A B D C is false") {
    val sorted: IsSorted = new IsSorted
    assert(sorted.isSorted2(Array("A", "B", "D", "C"), (a: String, b: String) => a > b) === false)
  }

  test("is sorted2 A B C D is false") {
    val sorted: IsSorted = new IsSorted
    assert(sorted.isSorted2(Array("A", "B", "C", "D"), (a: String, b: String) => a > b) === true)
  }
}

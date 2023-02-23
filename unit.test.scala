//> using dep "org.scalameta::munit::0.7.29"
package objektwerks

class UnitTest extends munit.FunSuite:
  test("unit") {
    assert(2 * 3 == 6)
  }
  test("sum") { // see library.scala
    assert( sum( List(1, 2, 3) ) == 6)
  }

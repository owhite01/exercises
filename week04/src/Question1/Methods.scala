package Question1


object Methods {
  def main(args: Array[String]) {
    val a = getSquare(3)
    assert(a == 9)

    val b = getSquare(6)
    assert(b == 36)

    val c = getSquare(5)
    assert(c == 25)

    val t1 = isArg1GreaterThanArg2(4.1, 4.12)
    assert(t1 == false)

    val t2 = isArg1GreaterThanArg2(2.1, 1.2)
    assert(t2 == true)

  }


  def getSquare(num: Int): Int = {
    num * num
  }

  def isArg1GreaterThanArg2(num1: Double, num2: Double): Boolean = {
    num1 > num2
  }



}

package Questions


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

    val m1 = manyTimesString("abc", 3)
    assert("abcabcabc" == m1, "Test")

    val m2 = manyTimesString("123", 2)
    assert("123123" == m2, "Test2")



  }


  def getSquare(num: Int): Int = {
    num * num
  }

  def isArg1GreaterThanArg2(num1: Double, num2: Double): Boolean = {
    num1 > num2
  }

  def manyTimesString(message: String, num3: Int): String = {
    message * num3
  }



}

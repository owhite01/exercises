package Questions

import atomicscala.AtomicTest._

object testCups {


  def main(args: Array[String]) {
    val cup1 = new Cup
    cup1.add(45) is 45
    cup1.add(-55) is 0
    cup1.add(10) is 10
    cup1.add(-9) is 1
    cup1.add(-2) is 0

    val cup2 = new Cup
    cup2.add(45) is 45
    cup2.add(-15) is 30
    cup2.add(-50) is -20

    val cup3 = new Cup
    cup3.set(56)
    cup3.get() is 56

  }

}

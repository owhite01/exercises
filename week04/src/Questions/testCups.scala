package Questions

import atomicscala.AtomicTest._

object testCups {


  def main(args: Array[String]) {
    val cup = new Cup
    assert(cup.add(45) == 45)
    assert(cup.add(-15) == 30)
    cup.add(45) is 45


    val cup2 = new Cup
    assert(cup2.add(45) == 45)
    assert(cup2.add(-55) == 0)
    assert(cup2.add(10) == 10)
    assert(cup2.add(-9) == 1)
    assert(cup2.add(-2) == 0)

    val cup3 = new Cup
    cup3.set(56)
    assert(cup3.get() == 56)

  }

}

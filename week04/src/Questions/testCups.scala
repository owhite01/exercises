package Questions

object testCups {
  def main(args: Array[String]) {
    val cup = new Cup
    assert(cup.add(45) == 45)
    assert(cup.add(-15) == 30)


    val cup2 = new Cup
    assert(cup2.add(45) == 45)
    assert(cup2.add(-55) == 0)
    assert(cup2.add(10) == 10)
    assert(cup2.add(-9) == 1)
    assert(cup2.add(-2) == 0)

  }

}

package NamedAndDefaultArguments
import Questions.atomicscala.AtomicTest._

//When I tried to name the method hours and call the argument the same name the IDE complained, had to rename.


class SimpleTime (hour: Int, minute: Int){
  def hours(): Int = {
    hour
  }

  def minutes(): Int = {
    minute
  }


}

class SimpleTime2 (hour: Int, minute: Int = 0){
  def hours(): Int = {
    hour
  }

  def minutes(): Int = {
    minute
  }


}

object SimpleTimeTest extends App{
  val t = new SimpleTime(hour=5, minute=30)
  t.hours is 5
  t.minutes is 30

  val t2 = new SimpleTime2(hour=10)
  t2.hours is 10
  t2.minutes is 0


}

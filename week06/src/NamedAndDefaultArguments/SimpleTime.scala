package NamedAndDefaultArguments
import Questions.atomicscala.AtomicTest._



case class SimpleTime (val hours: Int, val minutes: Int){


}

class SimpleTime2 (val hours: Int, val minutes: Int = 0){

}



//Dont need getters and setters for scala as that is already written when a case class is instantiated.
object SimpleTimeTest extends App{
  val t = new SimpleTime(hours=5, minutes=30)
  t.hours is 5
  t.minutes is 30

  val t2 = new SimpleTime2(hours=10)
  t2.hours is 10
  t2.minutes is 0


}

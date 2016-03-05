package ClassArguments
import Questions.atomicscala.AtomicTest._


class Square {

  def squareThem(nums: List[Int]): Int = {
    var total = 0
    for(eachNum <- nums){
      eachNum*eachNum + total
    }
    total

  }




}

/*
object squareTests extends App {
  val squareTest = new Square
  squareTest.squareThem(2) is 4
  squareTest.squareThem(2, 4) is 20
  squareTest.squareThem(1, 2, 4) is 21
}*/

package Questions.Vectors

import Questions.atomicscala

import scala.collection.mutable.ListBuffer
import atomicscala.AtomicTest._



class Vector {

  def printArray(): Unit = {
    var myString = Array("The", "dog", "visited", "the", "fire", "station")
    var sentence = ""
    myString.foreach {println}
    for (eachString <- myString){
      sentence += eachString + " "

    }
    sentence.toString() is "The dog visited the fire station "


  }

  def minMax(): Unit = {
    val ints = Array(1,2,3,4,5,6)
    val doubles = Array(1.1, 3.6, 5.7, 6.9)

    val myVector1 = Array(1, 2, 3 ,4, 5, 6)
    val myVector2 = Array(1, 2, 3 ,4, 5, 6)

    myVector1 is myVector2


    ints.sum
    ints.max
    ints.min

    doubles.sum
    doubles.max
    doubles.min

  }


}

object test{
  def main(args: Array[String]) {
    val test = new Vector
    test.printArray()
  }
}
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


}

object test{
  def main(args: Array[String]) {
    val test = new Vector
    test.printArray()
  }
}
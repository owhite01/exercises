package MapAndReduce
import math.Pi
import math.round

trait Shape {

  def sides(): Int{}
  def perimeter(): Double{}
  def area(): Double{}

}

trait Rectangular extends Shape {
  def firstSide(): Double {}

  def secondSide: Double {}

  def sides(): Int = {
    4
  }

  def perimeter(): Double = {
    firstSide * 2 + secondSide * 2
  }

  def area(): Double = {
    firstSide * secondSide
  }
}


abstract class Square1 (side: Double )extends Rectangular {
  def side1:Double = side
  def side2: Double = side

  }

case class Circle (radius: Double) extends Shape{
  def sides(): Int = {
    1

  }
  def area(): Double = {
    Pi * (radius*radius)
  }
  def perimeter(): Double = {
    2*Pi*radius
  }

}

case class Rectangle (side: Double, side1:Double )extends Shape{
  def sides(): Int  = {
    4
  }

  def perimeter(): Double = {
    2*(side + side1)
  }

  def area(): Double = {
    side * side1
  }

}

case class Square (side: Double )extends Shape{
  def sides(): Int = {
    4
  }

  def perimeter(): Double = {
    side*4
  }

  def area(): Double = {
    math.pow(side,2)
  }

}

object MyShapes extends App{

  val circle = Circle(2.00)
  println(circle.area(), circle.perimeter(), circle.sides())

  val rectangle = Rectangle(3,4)
  println(rectangle.area(),rectangle.perimeter(),rectangle.sides())

  val square = Square(5)
  println(square.area(),square.perimeter(),square.sides())

}

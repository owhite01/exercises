package MapAndReduce
import math.Pi

trait Shape {

  def sides: Int
  def perimeter: Double
  def area: Double

}


case class Circle (radius: Double) extends Shape{
  def sides(): Unit = {

  }
  def area(): Double = {
    Pi * (radius*radius)
  }
  def perimeter(): Double = {
    2*Pi*radius
  }

}



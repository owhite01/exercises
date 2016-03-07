package CaseClassesAndParameterizedTypesAndFuncAsObj
import Questions.atomicscala.AtomicTest._



case class Person (first: String, last: String, email: String){




}

object personTest extends App{
  val p = Person("Jane", "Smile", "jane@smile.com")
  p.first is "Jane"
  p.last is "Smile"
  p.email is "jane@smile.com"

  val people = Vector(
    Person("Jane","Smile","jane@smile.com"),
    Person("Ron","House","ron@house.com"),
    Person("Sally","Dove","sally@dove.com"))
  people(0) is "Person(Jane,Smile,jane@smile.com)"
  people(1) is "Person(Ron,House,ron@house.com)"
  people(2) is "Person(Sally,Dove,sally@dove.com)"

  // Return type is inferred:
  def inferred(c1: Char, c2: Char, c3: Char) = {
    Vector(c1, c2, c3)
  }
  // Explicit return type:
  def explicitDouble(c1: Double, c2: Double, c3: Double): Vector[Double] = {
    Vector(c1, c2, c3)
  }

  def explicitSet(set1: Vector[Double]): Set[Double] = {
      set1.toSet
  }

  def explicitList(vector1: Vector[Double]): List[Double] = {
    vector1.toList
  }

  def explicitVector(v1: Vector[Int]): Vector[Int] = {
    v1
  }

  inferred('a', 'b', 'c') is "Vector(a, b, c)"
  //explicit('a', 'b', 'c') is "Vector(a, b, c)"

  explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)

  explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
  explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)


  explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
  explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)

  var emptyString = ""
  val vectorOfNumbers = explicitVector(Vector(1, 2, 3, 4))
  vectorOfNumbers.foreach(n => emptyString = emptyString + n + ",")
  emptyString is "1,2,3,4,"

  val dogAge = (y:Int) => y*7
  dogAge(10) is 70

  var emptyString2 = ""
  val vectorOfNumbers2 = Vector(1, 5, 7, 8)
  vectorOfNumbers2.foreach(y => emptyString2 = emptyString2 + dogAge(y) + " ")
  emptyString2 is "7 35 49 56 "




  var emptyString3 = ""
  val vectorOfNumbers3 = Vector(1, 2, 5, 3, 7)
  vectorOfNumbers3.foreach(num => emptyString3 = emptyString3 + num*num + " ")
  emptyString3 is "1 4 25 9 49 "



}

package CaseClassesAndParameterizedTypes
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

  def explicitList(c1: Double, c2: Double, c3: Double): Vector[Double] = {
    Vector(c1, c2, c3)
  }

  def explicitList(c1: Double, c2: Double, c3: Double): Vector[Double] = {
    List(c1, c2, c3)
  }
  inferred('a', 'b', 'c') is "Vector(a, b, c)"
  //explicit('a', 'b', 'c') is "Vector(a, b, c)"

  explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)

  explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
  explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)
}

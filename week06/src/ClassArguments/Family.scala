package ClassArguments
import Questions.atomicscala.AtomicTest._

class Family (name: String*) {

  def familySize(): Int = {
    name.size
  }


}

object TestArgs extends App {
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4

  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3
}
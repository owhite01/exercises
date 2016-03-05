package ClassArguments
import Questions.atomicscala.AtomicTest._

class flexibleFamily (mum: String, dad: String, name: String*) {

  def familySize(): Int = {
    if(mum.isEmpty){
      name.size
      if(dad.isEmpty){
        name.size
      }
    }
    name.size + 2
  }
}

object TestArgs extends App {
  val family1 = new flexibleFamily("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4

  val family2 = new flexibleFamily("Dad", "Mom", "Harry")
  family2.familySize() is 3
}
package NamedAndDefaultArguments
import Questions.atomicscala.AtomicTest._
import scala.math._

class Item (name: String, price: Double){

  def cost(grocery: Boolean = false, medication: Boolean = false, taxRate: Double = 0.1): Double = {
    if(grocery == true || medication == true){
      price
    }else{
      //Had to look up how to do this, before i could only get the second one to return
      //3.300000000003, didnt know another way to round it to 1dp.
      BigDecimal((price*(1+taxRate))).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble

    }
  }


}

object itemTest extends App{
  val flour = new Item(name="flour", 4)
  flour.cost(grocery=true) is 4
  val sunscreen = new Item(
    name="sunscreen", 3)
  sunscreen.cost() is 3.3
  val tv = new Item(name="television", 500)
  tv.cost(taxRate = 0.06) is 530
}

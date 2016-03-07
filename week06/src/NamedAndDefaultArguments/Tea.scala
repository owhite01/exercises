package NamedAndDefaultArguments
import Questions.atomicscala.AtomicTest._

class Tea (val milk: Boolean = false, val sugar: Boolean  = false,
           val decaf: Boolean = false, val name: String = "Earl Grey"){

  def describe(): String = {
    var result = name
    if(milk == true)
      result += " + milk"
    if(sugar == true)
      result += " + sugar"
    if(decaf == true)
      result = result + " decaf"
    result
  }

  def calories(): Int = {
    var total = 0
    if(milk == true){
      total = total + 100
    }

    if (sugar == true){
      total = total + 16
    }

    total
  }


}

object TeaScript extends App {
  val tea = new Tea
  tea.describe is "Earl Grey"
  tea.calories is 0
  val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
  lemonZinger.describe is "Lemon Zinger decaf"
  lemonZinger.calories is 0
  val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
  sweetGreen.describe is "Jasmine Green + sugar"
  sweetGreen.calories is 16
  val teaLatte = new Tea(sugar=true, milk=true)
  teaLatte.describe is "Earl Grey + milk + sugar"
  teaLatte.calories is 116
}


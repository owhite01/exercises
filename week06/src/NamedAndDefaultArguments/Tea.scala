package NamedAndDefaultArguments
import Questions.atomicscala.AtomicTest._

class Tea (name: String, sugar: Boolean, decaf: Boolean, milk: Boolean, calories: Int = 0){
  def describe(): String = {
    name
  }

  def calories(): Int = {
    if(milk == true){
      calories + 100
    }

    if (sugar == true){
      calories + 16
    }
  }


}

/*object TeaScript extends App {
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
}*/


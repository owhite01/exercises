
object FirstQuestion {
  def main(args: Array[String]): Unit = {
    func1("Sunny", 100)
    func2("Partly Cloudy", 100)

  }


  def func1(weather: String, temp: Int): Unit ={
    if (temp > 80) {
      if (weather == "Sunny") {
        println("True")
      }
      else
        println("False")
    }
  }

  def func2(weather: String, temp: Int): Unit ={
    if (weather == "Sunny" || weather == "Partly Cloudy") {
      if (temp > 80 || temp < 20)
      println("True")
    }
    else
      println("False")

  }

}

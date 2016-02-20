
object FirstQuestion {
  def main(args: Array[String]): Unit = {
    func1("Sunny", 100)
    func2("Partly Cloudy", 120)
    func3("Partly Cloudy", 10)
    FahrenheitToCelsius(50)
    CelsiusToFahrenheit(27)

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
      if (temp > 80)
        println("True")
    }
    else
      println("False")

  }

  def func3(weather: String, temp: Int): Unit ={
    if (weather == "Sunny" || weather == "Partly Cloudy") {
      if (temp > 80 || temp < 20)
      println("True")
    }
    else
      println("False")

  }


  def FahrenheitToCelsius(temperature: Float) {
    var answer: Float = 0
    answer = (temperature - 32)
    answer = answer * (5 / 9)
    println(answer)


  }

  def CelsiusToFahrenheit(temperature: Float) {
    var answer: Float = 0
    answer = (temperature * (9 / 5)) + 32
    println(answer)


  }


}

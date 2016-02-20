
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
  var result = "True"

  if (temp > 80) {
    println("True")
  }
  else
    println("False")

}

func1("Sunny", 90)
func2("Sunny", 90)
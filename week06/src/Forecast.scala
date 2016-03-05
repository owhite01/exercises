
import Questions.atomicscala

import scala.collection.mutable.ListBuffer
import atomicscala.AtomicTest._
object Forecast extends App{
  forecast(100) is "Sunny"
  forecast(80) is "Mostly Sunny"
  forecast(50) is "Partly Sunny"
  forecast(20) is "Mostly Sunny"
  forecast(0) is "Cloudy"
  forecast(15) is "Unknown"


  def forecast(temp: Int): String = temp match{
    case 100 => "Sunny"
    case 80 => "Mostly Sunny"
    case 50 => "Partly Sunny"
    case 20 => "Mostly Sunny"
    case 0 => "Cloudy"
    case 15 => "Unknown"
    case _ => "Unknown"
  }


}

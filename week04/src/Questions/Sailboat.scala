package Questions

class Sailboat {
  def main(args: Array[String]) {

  }

  def raise(): String = {
    "Sails raised"
  }

  def lower(): String = {
    "Sails lowered"
  }

  def signal(): String = {
    val Flare = new Flare
    Flare.light()
  }

}

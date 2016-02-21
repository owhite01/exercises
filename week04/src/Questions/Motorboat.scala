package Questions

class Motorboat {


  def on(): String ={
    "Motor on"
  }

  def off(): String ={
    "Motor off"
  }

  def signal(): String = {
    val Flare = new Flare
    Flare.light()
  }

}

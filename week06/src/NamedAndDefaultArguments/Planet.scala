package NamedAndDefaultArguments
import Questions.atomicscala.AtomicTest._

class Planet (moons: Int, name: String, description: String){

  def hasMoon(): Boolean = {
    if(moons == 0){
      false
    }else{
      true
    }
  }

}

object planetTest extends App{
  val p = new Planet(name = "Mercury",
    description = "small and hot planet", moons = 0)
  p.hasMoon is false

  //Did not have to change code, as the named argument is used in the hasMoon method regardless of
  //order
  val earth = new Planet(moons = 1, name = "Earth",
    description = "a hospitable planet")
  earth.hasMoon is true
}

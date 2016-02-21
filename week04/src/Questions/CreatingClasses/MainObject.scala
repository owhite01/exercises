package Questions.CreatingClasses

/**
  * Created by OliverW on 21/02/2016.
  */
object MainObject {
  def main(args: Array[String]) {
    println(new Giraffe)
    println(new Hippo)
    println(new Lion)
    println(new Monkey)
    println(new Tiger)

    println("")

    //Different storage in memory
    println(new Lion)
    println(new Giraffe)
    println(new Giraffe)



  }


}

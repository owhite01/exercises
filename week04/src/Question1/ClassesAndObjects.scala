package Question1

/**
  * Created by OliverW on 21/02/2016.
  */
object ClassesAndObjects {
   def main(args: Array[String]) {
     val x = 1 to 5
     val y = 2 to 10 by 2
     var s1: String = "Sally"
     var s2: String = "Sally"
     if(s1.equals(s2)){
       println("Strings are equal")
     }else{
       println("Strings are not equal")
     }


     println(x.indexOf(2) - x.indexOf(1))
     println(y.indexOf(2) - y.indexOf(1))



   }



}

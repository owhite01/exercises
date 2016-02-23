package Questions
//import com.atomicscala.AtomicTest._


class Cup{
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
      if(percentFull < 0){
        percentFull = 0
    }




    percentFull // Return this value
  }


}

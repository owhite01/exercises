package Questions
//import Questions.AtomicTest._


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

  def set(userSet: Int): Unit ={
    percentFull = userSet

  }

  def get(): Int ={
    percentFull


  }


}

import Questions.atomicscala.AtomicTest._

val v1 = Vector(1, 2, 3, 4)
v1.map(n => n + 1) is Vector(2, 3, 4, 5)

//Error appears when using foreach
val v2 = Vector(1, 2, 3, 4)
v2.map(n=> n * 11 + 10) is Vector(21, 32, 43, 54)

val v3 = Vector(1, 2, 3, 4)
v3.foreach(n=> n*11 + 10)


val v4 = Vector(1, 2, 3, 4)
v4.map(n => n + 1) is Vector(2, 3, 4, 5)

val v5 = Vector(1, 2, 3, 4)
val v6 = Vector()
for(i<-v5){
  i+1
}


val v = Vector(1, 10, 100, 1000)
v.reduce((sum, n) => sum + n) is 1111


def addVector(): Unit = {
  val v7 = Vector(1, 10, 100, 1000)
  val total = 0
  for(i<-v7){
    i+total
  }
}

addVector()

def sumIt(nums: Int*): Int = {
  var total = 0
  //nums.reduce(sum, nums)
}

sumIt(1, 2, 3) is 6
sumIt(45, 45, 45, 60) is 195


trait Shape
  var side: Int
  var perim: Int
  var areaOfShape: Int
  def sides(): Int = {
    side

  }

  def perimeter(): Int = {
    perim

  }

  def area(): Int = {
    areaOfShape

  }

class Circle extends Shape{

}






























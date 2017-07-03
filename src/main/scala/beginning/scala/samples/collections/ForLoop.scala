package beginning.scala.samples.collections

/**
  * Created by seonbo.shim on 2017-06-29.
  */
object ForLoop {

  val numbers = List(1,2,3,4,5)
  val doubled = numbers.map(x=>x*2)

  def main(args: Array[String]): Unit = {
    println(numbers)
    println(doubled)
    println("-----------------------------")
    numbers.filter(x=> x>3).foreach(println)
    println("-----------------------------")
    doubled.filter(_ < 6).foreach(println)
  }

}

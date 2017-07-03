package beginning.scala.samples.clazzes

/**
  * Created by seonbo.shim on 2017-06-28.
  */
object ComplexMain {
  def main(args: Array[String]): Unit = {
    val c = new Complex(1.2, 2.3)
    println("imaginary part: " + c.im())

    val c2 = new ComplexSimple(2.3, 4.5);
    println("c2: " + c2)
    println("imaginary part: " + c2.im)

  }
}

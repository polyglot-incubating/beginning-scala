package beginning.scala.samples.clazzes

/**
  * Created by seonbo.shim on 2017-06-28.
  */
class ComplexSimple(real:Double, imaginary:Double) {
  def re = real
  def im = imaginary

  override def toString() = "" + re + (if (im < 0) "" else "+") + im + " i"
}

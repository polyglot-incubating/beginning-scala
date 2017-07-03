package beginning.scala.samples

/**
  * Created by seonbo.shim on 2017-06-28.
  */
object AnonymousObject {
  def oncePerSecond(callback:()=>Unit): Unit = {
    while (true) { callback(); Thread sleep 1000 }
  }
  def main(args: Array[String]): Unit = {
    val anonymous = ()=>println ("time flies like an arrow..." )
    oncePerSecond(anonymous)
  }
}

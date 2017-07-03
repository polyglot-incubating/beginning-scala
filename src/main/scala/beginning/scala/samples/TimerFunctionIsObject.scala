package beginning.scala.samples

/**
  * Created by seonbo.shim on 2017-06-28.
  */
object TimerFunctionIsObject {

  def timeFlies(): Unit = {
    println("time flies like an arrow...")
  }

  def oncePerSecond(callback: () => Unit) {
    while(true ) {
      callback()
      Thread sleep 1000
    }
  }

  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}

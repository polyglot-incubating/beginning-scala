package beginning.scala.samples

import java.util.{Date, Locale}
import java.text.DateFormat._

/**
  * Created by seonbo.shim on 2017-06-28.
  */
object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)  // df format now == df.format(now)
  }
}

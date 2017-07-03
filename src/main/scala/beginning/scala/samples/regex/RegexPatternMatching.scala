package beginning.scala.samples.regex

/**
  * Created by seonbo.shim on 2017-06-29.
  */
class RegexPatternMatching {
}


object RegexPatternMatching extends App {

  val isTwoNumbers = "([\\d]{2})-([\\d]{2})-([\\d]{2})".r

  def info(value: String): Unit = value match {
    case isTwoNumbers(a, b, c) if a==c
      => println(s"a equals to c, result: $a == $c")
    case isTwoNumbers(a, "77", c)
    => println("b is 77")
    case isTwoNumbers(a, b, c)
    => println(s"a: $a, b: $b, c: $c")
    case _
      => println("Not matched!")
  }

  info("12-34-56")
  info("98-76")
  info("12-77-56")
  info("11-33-11")
}

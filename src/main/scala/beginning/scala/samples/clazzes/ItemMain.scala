package beginning.scala.samples.clazzes

/**
  *
  * Scala 는 constructor, getter, setter 가 기본적으로 포함 되어 있다.
  * 거기에 case 클래스는 toString, equals, hashCode 가 기본적으로 포함 되어 있다.
  *
  *
  * @param no
  * @param name
  * @param price
  */
case class Item(no:Long, name:String, price:Double)

/**
  * Created by seonbo.shim on 2017-06-29.
  */
object ItemMain extends App {


}

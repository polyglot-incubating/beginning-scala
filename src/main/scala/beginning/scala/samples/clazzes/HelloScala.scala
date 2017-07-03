package beginning.scala.samples.clazzes

/**
  * Created by seonbo.shim on 2017-06-29.
  */
class HelloScala

class HelloScala2 {}

class HelloScala3(id:Int, name:String)

class HelloScala4(id:Int, var name:String)

case class HelloScala5(id:Int, name:String)

object HelloMain extends App {

  val hello = new HelloScala()
  println(s"hello $hello")

  val hello2 = new HelloScala2()
  println(s"hello2 $hello2")

  val hello3 = new HelloScala3(1, "AAA")
  // 함수형 프로그래밍은 기본적으로 순수 함수 이므로 값의 변형을 허용 하지 않는다.
  // hello3.name = "AAB" // can't not resolve symbol name.
  println(s"hello3 $hello3")

  val hello4 = new HelloScala4(1, "AAA")
  hello4.name = "AAB" // HelloScala4 클래스 선언부에서 name 속성은 변수로 선언 하였기 때문에 가능 하다.
  println(s"hello4 $hello4")

  val hello5 = new HelloScala5(1, "AAA")
  println(s"hello5 $hello5")

  val hello6 = HelloScala5(1, "AAA")
  println(s"hello6 $hello6")

}
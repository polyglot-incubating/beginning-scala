package beginning.scala.samples.matches

/**
  * Created by seonbo.shim on 2017-06-29.
  */
case class CItem(id:Long,name:String,price:Double)

class NItem extends CItem(6L,"NItem",1.1)


object CaseItemMain extends App {


  def info(item:CItem):Unit = item match {
    case CItem(1L,_,_) => println("CItem's id is 1.")

    case CItem(_,"aider",_) => println("CItem is aider.")

    case CItem(id,name,price) => println(s"CItem id: $id, name: $name, price: $price")

    case _ => println("Not matched.")
  }

  val item = CItem(1L,"lamp",2.1)

  info(item)
  info(CItem(2L,"park",2.2))
  info(CItem(3L,"aider",3.1))
  info(new NItem())

}

package co.com.ceiba.scala.reconocimientopatrones

object Test2Match extends App {
  def matchTest(x: Any): Any = {
    x match {  
      case 1 => "one"
      case "two" => 2
      case y: Int => "scala.Int"
    }
  }
  println(matchTest("two"))
}
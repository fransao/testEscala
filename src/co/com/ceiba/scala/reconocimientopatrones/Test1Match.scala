package co.com.ceiba.scala.reconocimientopatrones

object Test1Match extends App {
  def matchTest(x: Int): String = { 
    x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
    }
  }
  println(matchTest(3))
} // imprime many
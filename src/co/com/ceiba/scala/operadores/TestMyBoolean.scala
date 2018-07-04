package co.com.ceiba.scala.operadores

object TestMyBoolean extends App {
  
  val bool = new MyBool(true)
  
  println(bool.and(new MyBool(false)))
  println(bool.or(new MyBool(false)))
  println(bool.negate())
  
} // imprime false, true, false
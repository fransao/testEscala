package co.com.ceiba.scala.inferenciatiposlocal

object TestInferencia extends App {
  val x = 1 + 2 * 3         // el tipo de  x es Int
  val y = x.toString()      // el tipo de y es String
  def succ(x: Int) = x + 1  // el método succ retorna valores Int
  
  println(x)
  println(y)
  
}
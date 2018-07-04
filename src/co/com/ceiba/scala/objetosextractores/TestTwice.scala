package co.com.ceiba.scala.objetosextractores

object TestTwice extends App {
  val x = Twice(21)
  x match { case Twice(n) => Console.println(n) } // imprime 21
}
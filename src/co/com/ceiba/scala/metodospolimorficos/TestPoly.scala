package co.com.ceiba.scala.metodospolimorficos

object TestPoly extends App  {
  def dup[T](x: T, n: Int): List[T] = {
    if (n == 0) Nil
    else x :: dup(x, n - 1)
  }
  println(dup[Int](3, 4))  // linea 5
  println(dup("three", 3)) // linea 6
} 
// imprime List(3, 3, 3, 3)
// imprime List(three, three, three)
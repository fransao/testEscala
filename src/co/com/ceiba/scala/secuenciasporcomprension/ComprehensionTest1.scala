package co.com.ceiba.scala.secuenciasporcomprension

object ComprehensionTest1 extends App {
  
  def pares(desde: Int, hasta: Int): List[Int] =
    for (i <- List.range(desde, hasta) if i % 2 == 0)  yield i 
    println(pares(0, 20))
    
  
  /*
   * Aquí se muestra un ejemplo más complicado que computa todos los pares de números entre 0 y n-1 
   * cuya suma es igual a un número dado v:
   * 
   */
  def foo(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- i until n if i + j == v) yield
      Pair(i, j);
  foo(20, 32) foreach {
    case (i, j) =>
      println("(" + i + ", " + j + ")")
  }
}
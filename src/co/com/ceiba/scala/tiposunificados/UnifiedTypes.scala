package co.com.ceiba.scala.tiposunificados

object UnifiedTypes extends App {
  val set = new scala.collection.mutable.LinkedHashSet[Any]
  set += "This is a string"  // suma un String
  set += 732                 // suma un número
  set += 'c'                 // suma un caracter
  set += true                // suma un valor booleano
  set += main _              // suma la función main
  val iter: Iterator[Any] = set.iterator
  while (iter.hasNext) {
    println(iter.next.toString())
  }
}
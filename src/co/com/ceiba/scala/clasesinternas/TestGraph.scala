package co.com.ceiba.scala.clasesinternas

object GraphTest extends App {
  val g = new Graph
  val n1 = g.newNode
  val n2 = g.newNode
  val n3 = g.newNode
  
  n1.connectTo(n2)
  n3.connectTo(n1)
  
  println(g.nodes)
}
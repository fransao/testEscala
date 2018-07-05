package co.com.ceiba.scala.autoreferenciaexplicitamentetipada

object TestGraph extends App {
  val g: Grafo = new GrafoDirigidoConcreto
  
  val n1 = g.agregarNodo
  val n2 = g.agregarNodo
  val n3 = g.agregarNodo
  
  n1.conectarCon(n2)
  n2.conectarCon(n3)
  n1.conectarCon(n3)
  
}

package co.com.ceiba.scala.autoreferenciaexplicitamentetipada

abstract class Grafo {
  type Vertice
  type Nodo <: NodoIntf
  
  abstract class NodoIntf {
    def conectarCon(nodo: Nodo): Vertice
  }
  
  def nodos: List[Nodo]
  def vertices: List[Vertice]
  def agregarNodo: Nodo
}
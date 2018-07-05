package co.com.ceiba.scala.autoreferenciaexplicitamentetipada

abstract class GrafoDirigido extends Grafo {
  type Vertice <: VerticeImpl
  
  class VerticeImpl(origen: Nodo, dest: Nodo) {
    def desde = origen
    def hasta = dest
  }

  class NodoImpl extends NodoIntf {
    self: Nodo =>
    def conectarCon(nodo: Nodo): Vertice = {
      val vertice = nuevoVertice(this, nodo) // ahora legal
      vertices = vertice :: vertices
      vertice
    }
  }
  
  protected def nuevoNodo: Nodo
  protected def nuevoVertice(desde: Nodo, hasta: Nodo): Vertice
  
  var nodos: List[Nodo] = Nil
  var vertices: List[Vertice] = Nil
  
  def agregarNodo: Nodo = {
    val nodo = nuevoNodo
    nodos = nodo :: nodos
    nodo
  }
}
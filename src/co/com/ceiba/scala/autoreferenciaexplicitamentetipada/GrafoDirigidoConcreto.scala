package co.com.ceiba.scala.autoreferenciaexplicitamentetipada

class GrafoDirigidoConcreto extends GrafoDirigido {
  type Vertice = VerticeImpl
  type Nodo = NodoImpl
  protected def nuevoNodo: Nodo = new NodoImpl
  protected def nuevoVertice(d: Nodo, h: Nodo): Vertice =
    new VerticeImpl(d, h)
}
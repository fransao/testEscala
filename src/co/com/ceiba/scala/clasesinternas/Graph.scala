package co.com.ceiba.scala.clasesinternas

class Graph {
  
  var nodes: List[Node] = Nil
  
  class Node {
    var connectedNodes: List[Node] = Nil
    
    def connectTo(node: Node) { // para unir nodos de diferentes grafos connectTo(node: Graph#Node)
      if (connectedNodes.find(node.equals).isEmpty) {
        connectedNodes = node :: connectedNodes
      }
    }
  }
   
  def newNode(): Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }
}
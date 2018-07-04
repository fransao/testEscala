package co.com.ceiba.scala.tipoabstractos

object AbstractTypeTest1 {
  
  def main (args: Array[String]) : Unit = {
    val buffer = newIntSeqBuffer(7,8)
    println("length: " + buffer.length )
    println("contenido: " + buffer.element)
  }
 
  def newIntSeqBuffer(element1: Int, element2: Int): IntSeqBuffer = {
    new IntSeqBuffer {
      type T = List[U]
      val element = List (element1, element2)
    }
  }
  
}
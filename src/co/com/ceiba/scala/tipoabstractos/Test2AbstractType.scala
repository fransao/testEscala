package co.com.ceiba.scala.tipoabstractos

object AbstractTypeTest2 {
  
  def main (args: Array[String]) : Unit = {
    val buffer = newIntSeqBuffer(7,8)
    println("length: " + buffer.length )
    println("contenido: " + buffer.element)
  }
 
  def newIntSeqBuffer(element1: Int, element2: Int): SeqBuffer2[Int, Seq[Int]] = {
    new SeqBuffer2[Int, List[Int]] {      
      val element = List (element1, element2)
    }
  }
  
}
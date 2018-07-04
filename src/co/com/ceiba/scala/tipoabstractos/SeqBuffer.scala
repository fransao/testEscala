package co.com.ceiba.scala.tipoabstractos

abstract class SeqBuffer extends Buffer {
  type U
  type T <: Seq[U]
  
  def length = element.length
}
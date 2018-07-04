package co.com.ceiba.scala.tipoabstractos

abstract class SeqBuffer2[U, +T <: Seq[U]] extends Buffer2[T] {  
  def length = element.length
}
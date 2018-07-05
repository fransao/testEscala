package co.com.ceiba.scala.limitetipadosuperior

case class MyInt(x: Int) extends Similar {
  def isSimilar(m: Any): Boolean = {
    m.isInstanceOf[MyInt] &&  m.asInstanceOf[MyInt].x == x
  }
}
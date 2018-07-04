package co.com.ceiba.scala.funcionesordensuperior

class Decorator(left: String, right: String) {
  def layout[A](x: A) = left + x.toString() + right
}
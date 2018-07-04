package co.com.ceiba.scala.funcionesordensuperior

object TestFun extends App {
  
  def apply(f: Int => String, v: Int) = f(v)
  
  val decorator = new Decorator("[", "]")
  
  println(apply(decorator.layout, 7))
  
} // imprime [7]
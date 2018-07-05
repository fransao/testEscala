package co.com.ceiba.scala.limitetipadosuperior

object TestUpperBound extends App {
  
  def findSimilar[T <: Similar](e: T, xs: List[T]): Boolean = {
    if (xs.isEmpty) false
    else if (e.isSimilar(xs.head)) true
    else findSimilar[T](e, xs.tail)
  }
  
  val list: List[MyInt] = List(MyInt(1), MyInt(2), MyInt(3))
  println(findSimilar[MyInt](MyInt(4), list))
  println(findSimilar[MyInt](MyInt(2), list))
  
} // imprime false, true
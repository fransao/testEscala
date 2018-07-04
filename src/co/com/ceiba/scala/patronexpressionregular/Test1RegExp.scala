package co.com.ceiba.scala.patronexpressionregular

object Test1RegExp  {
  
  def main (args:Array[String]) : Unit = {
    println(containsScala("scalada es bueno"))    
  }
  
  def containsScala(x: String): Boolean = {
    val z: Seq[Char] = x
    z match {
      case Seq('s','c','a','l','a', rest @ _*) =>
        println("rest is "+rest)
        true
      case Seq(_*) =>
        false
    }
  }
}
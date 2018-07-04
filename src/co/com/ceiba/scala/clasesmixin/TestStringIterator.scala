package co.com.ceiba.scala.clasesmixin

object StringIteratorTest {
  
  def main(args: Array[String]) {
    
    class Iter extends StringIterator("Hola mundo") with RichIterator
    
    val iter = new Iter
    iter foreach println
  }
  
}
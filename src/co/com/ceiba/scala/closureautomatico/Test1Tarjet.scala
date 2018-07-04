package co.com.ceiba.scala.closureautomatico

object TargetTest1 {
 
  def main (args: Array[String]): Unit = {
    var i = 10  
    whileLoop (i > 0) {
      println(i)
      i -= 1
    }
  }
  
  def whileLoop(cond: => Boolean)(body: => Unit): Unit = {
    if (cond) {
      body
      whileLoop(cond)(body)
    }
  }
    
}
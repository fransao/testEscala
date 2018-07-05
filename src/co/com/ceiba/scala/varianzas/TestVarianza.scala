package co.com.ceiba.scala.varianzas

object TestVarianza {
  def main (args: Array[String]) :Unit = {
    var s: Stack[Any] = new Stack().push("hello")
    s = s.push(new Object())
    s = s.push(7)
    println(s)    
  }
}
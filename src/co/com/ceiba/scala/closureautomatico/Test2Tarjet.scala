package co.com.ceiba.scala.closureautomatico

object TargetTest2 extends App {
  
  def loop(body: => Unit): LoopUnlessCond = new LoopUnlessCond(body)
  
  protected class LoopUnlessCond(body: => Unit) {
    def unless(cond: => Boolean) {
      body
      if (!cond) unless(cond)
    }
  }
  
  var i = 10
  loop {
    println("i = " + i)
    i -= 1
  } unless (i == 0)
}

// imprime 
//i = 10
//i = 9
//i = 8
// ...
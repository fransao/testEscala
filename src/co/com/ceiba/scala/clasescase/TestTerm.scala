package co.com.ceiba.scala.clasescase

object TestTerm {
  
  def main(args: Array[String]) :Unit = {
    Fun("x", Fun("y", App(Var("x"), Var("y"))))
    new Fun("x", Fun("y", App(Var("x"), Var("y"))))
    
    val v = Var("x")
    val f = Fun("y", v)
    val a = App(v,f)
    
    println(v.name)
    println(f.arg)
    println(a.f + " " + a.v)

  }
}
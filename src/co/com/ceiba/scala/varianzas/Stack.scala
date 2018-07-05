package co.com.ceiba.scala.varianzas

class Stack[+T] {
  def push[S >: T](elem: S): Stack[S] = new Stack[S] {
    override def top: S = elem
    override def pop: Stack[S] = Stack.this
    override def toString: String =
      elem.toString + " " + Stack.this.toString
  }
  def top: T = sys.error("no element on stack")
  def pop: Stack[T] = sys.error("no element on stack")
  override def toString: String = ""
}
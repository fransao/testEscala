package co.com.ceiba.scala.limitetipadoinferior

object TestLowerBound extends App {
  
  val empty:   ListNode[Null]   = ListNode(null, null)
  val strList: ListNode[String] = empty.prepend("hello").prepend("world")
  val anyList: ListNode[Any]    = strList.prepend(12345)
  
  
}

package co.com.ceiba.scala.operadores

class MyBool(x: Boolean) {
  
  def and(that: MyBool): MyBool = if (x) that else this
  
  def or(that: MyBool): MyBool = if (x) this else that
  
  def negate(): MyBool = new MyBool(!x)
  
}
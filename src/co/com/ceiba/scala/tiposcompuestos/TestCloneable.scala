package co.com.ceiba.scala.tiposcompuestos

object TestCloneable extends App {
  
  /*
   * La pregunta que surge es cuál es el tipo del parámetro obj. Si este fuera Cloneable 
   * entonces el objeto puede ser clonado mediante el método clone, pero no puede usarse el método reset; 
   * Si fuera Resetable podríamos resetearlo mediante el método reset, pero no sería posible clonarlo. 
   * Para evitar casteos (refundiciones, en inglés casting) de tipos en situaciones como la descrita, 
   * podemos especificar que el tipo del objeto obj sea tanto Clonable como Resetable
   * 
   */
  def cloneAndReset(obj: Cloneable with Resetable): Cloneable = {
    val cloned = obj.clone()
    obj.reset
    cloned
  }
  
}
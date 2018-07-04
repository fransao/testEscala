package co.com.ceiba.scala.clasesmixin

trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit) { 
    while (hasNext) f(next) 
  }
}
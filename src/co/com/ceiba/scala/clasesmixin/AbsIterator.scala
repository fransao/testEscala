package co.com.ceiba.scala.clasesmixin

abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next: T
}
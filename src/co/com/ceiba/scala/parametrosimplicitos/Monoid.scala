package co.com.ceiba.scala.parametrosimplicitos

abstract class Monoid[A] extends SemiGroup[A] {
  def unit: A
}
package co.com.ceiba.scala.parametrosimplicitos

abstract class SemiGroup[A] {
  def add(x: A, y: A): A
}

package co.com.ceiba.scala.anotacion

import java.io._
import java.io.IOException
import java.io.IOException

// Manejo de excepciones con anotaciones
class Reader(fname: String) {
  private val in = new BufferedReader(new FileReader(fname))
  
  @throws(classOf[IOException])  
  def read() = in.read()
  
}
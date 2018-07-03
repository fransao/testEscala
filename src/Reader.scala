
import java.io._

// Manejo de excepciones con 
class Reader(fname: String) {
  private val in = new BufferedReader(new FileReader(fname))
  
  @throws(classOf[IOException])  
  def read() = in.read()
  
}
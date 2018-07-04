import scala.collection.immutable
import scala.collection.mutable
import scala.collection.mutable.Buffer

object workSheet {
  2 + 2                                           //> res0: Int(4) = 4
  println("Hola mundo")                           //> Hola mundo
  
  val n=5                                         //> n  : Int = 5
  
  if (n == 5) {
    println ("Si, n vale 5")
    
  }                                               //> Si, n vale 5
 
 
 var mes = 6                                      //> mes  : Int = 6
 
 mes match {
  case 1 => "Enero"
  case 2 => "Febrero"
  case 3 => "Marzo"
  case 4 => "Abril"
  case 5 => "Mayo"
  case 6 => "Junio"
  case 7 => "Julio"
  case 8 => "Agosto"
  case _ => "Ninguno"
 }                                                //> res1: String = Junio
  
 var k = 0                                        //> k  : Int = 0
 while (k < 20) {
   k= k+1
   println(s"k vale $k (el siguiente es ${k+1})" )
 }                                                //> k vale 1 (el siguiente es 2)
                                                  //| k vale 2 (el siguiente es 3)
                                                  //| k vale 3 (el siguiente es 4)
                                                  //| k vale 4 (el siguiente es 5)
                                                  //| k vale 5 (el siguiente es 6)
                                                  //| k vale 6 (el siguiente es 7)
                                                  //| k vale 7 (el siguiente es 8)
                                                  //| k vale 8 (el siguiente es 9)
                                                  //| k vale 9 (el siguiente es 10)
                                                  //| k vale 10 (el siguiente es 11)
                                                  //| k vale 11 (el siguiente es 12)
                                                  //| k vale 12 (el siguiente es 13)
                                                  //| k vale 13 (el siguiente es 14)
                                                  //| k vale 14 (el siguiente es 15)
                                                  //| k vale 15 (el siguiente es 16)
                                                  //| k vale 16 (el siguiente es 17)
                                                  //| k vale 17 (el siguiente es 18)
                                                  //| k vale 18 (el siguiente es 19)
                                                  //| k vale 19 (el siguiente es 20)
                                                  //| k vale 20 (el siguiente es 21)
  
val frutas = Array ("manzana","pera","limon","mango")
                                                  //> frutas  : Array[String] = Array(manzana, pera, limon, mango)
  
  frutas.apply(2)                                 //> res2: String = limon
  frutas(1)                                       //> res3: String = pera
  
  frutas(3)                                       //> res4: String = mango
  frutas.length                                   //> res5: Int = 4
  
  
  var numeros = List(1,2,3,4,5,6,7,8,9,10)        //> numeros  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  
  def doble  (a:Int) : Int = 2*a                  //> doble: (a: Int)Int
  
  numeros.map (x => doble(x))                     //> res6: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
  
  var marcas = List("Toyota", "Chevrolet", "Mazda", "Kia")
                                                  //> marcas  : List[String] = List(Toyota, Chevrolet, Mazda, Kia)
  marcas.map{m => m.toUpperCase()}                //> res7: List[String] = List(TOYOTA, CHEVROLET, MAZDA, KIA)
  marcas.map (_.toLowerCase())                    //> res8: List[String] = List(toyota, chevrolet, mazda, kia)
  
  var lista = List(List(2,4), List(6,8,6),List(4,2,1))
                                                  //> lista  : List[List[Int]] = List(List(2, 4), List(6, 8, 6), List(4, 2, 1))
  
  lista.flatten                                   //> res9: List[Int] = List(2, 4, 6, 8, 6, 4, 2, 1)
  
  
  lista.flatMap { x: List[Int] => x.map {n => 2 * n} }
                                                  //> res10: List[Int] = List(4, 8, 12, 16, 12, 8, 4, 2)
  marcas.flatMap{_.toUpperCase()}.distinct        //> res11: List[Char] = List(T, O, Y, A, C, H, E, V, R, L, M, Z, D, K, I)
 
 
 val set = Set(1,2,3,4,5)                         //> set  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
 set + 6                                          //> res12: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)
 
 set ++ Set(6,7,8,9)                              //> res13: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 9, 2, 7, 3, 8, 4)
                                                  //| 
 // intersect y & son lo mismo, ver ejemplo:
 set intersect Set(3,4,6)                         //> res14: scala.collection.immutable.Set[Int] = Set(3, 4)
 set & Set(3,4,6)                                 //> res15: scala.collection.immutable.Set[Int] = Set(3, 4)
 
 // union es igual a |, ver ejemplo:
 set union Set(4,5,6)                             //> res16: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)
 set | Set(4,5,6)                                 //> res17: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)
 
 // diferencia es iguala &~, ver ejemplo:
 set diff Set(3,4)                                //> res18: scala.collection.immutable.Set[Int] = Set(5, 1, 2)
 set &~ Set(3,4)                                  //> res19: scala.collection.immutable.Set[Int] = Set(5, 1, 2)
 
 val mutSet = mutable.Set(1,2,3,4,5)              //> mutSet  : scala.collection.mutable.Set[Int] = Set(1, 5, 2, 3, 4)
 mutSet ++= Set(6,7)                              //> res20: workSheet.mutSet.type = Set(1, 5, 2, 6, 3, 7, 4)
 mutSet                                           //> res21: scala.collection.mutable.Set[Int] = Set(1, 5, 2, 6, 3, 7, 4)
 
 mutSet retain {x=> x%2==0}
 mutSet                                           //> res22: scala.collection.mutable.Set[Int] = Set(2, 6, 4)
 
 // ordenar
 val sortedSet = immutable.SortedSet(5,3,2,4,1)   //> sortedSet  : scala.collection.immutable.SortedSet[Int] = TreeSet(1, 2, 3, 4
                                                  //| , 5)
 val mayorAMenor = Ordering.fromLessThan[Int](_ > _)
                                                  //> mayorAMenor  : scala.math.Ordering[Int] = scala.math.Ordering$$anon$9@4678c
                                                  //| 730
 //orden inverso
 val sortedSetIerso = immutable.SortedSet.empty(mayorAMenor) ++ sortedSet
                                                  //> sortedSetIerso  : scala.collection.immutable.SortedSet[Int] = TreeSet(5, 4,
                                                  //|  3, 2, 1)
 // Mapas
 val mapa = Map(1->"Maria", 2->"Pepito", 3->"Matha")
                                                  //> mapa  : scala.collection.immutable.Map[Int,String] = Map(1 -> Maria, 2 -> P
                                                  //| epito, 3 -> Matha)
 mapa.keys                                        //> res23: Iterable[Int] = Set(1, 2, 3)
 mapa.values                                      //> res24: Iterable[String] = MapLike.DefaultValuesIterable(Maria, Pepito, Math
                                                  //| a)
 mapa.get(2)                                      //> res25: Option[String] = Some(Pepito)
 mapa(2)                                          //> res26: String = Pepito
 
 mapa.get(9)                                      //> res27: Option[String] = None
 // mapa(9) error no existe
 mapa.getOrElse(9, null)                          //> res28: String = null
 
 // mapa operaciones
 mapa + (4->"Luis", 5->"Sandra")                  //> res29: scala.collection.immutable.Map[Int,String] = Map(5 -> Sandra, 1 -> M
                                                  //| aria, 2 -> Pepito, 3 -> Matha, 4 -> Luis)
 mapa -3                                          //> res30: scala.collection.immutable.Map[Int,String] = Map(1 -> Maria, 2 -> Pe
                                                  //| pito)
 val mapa1 = Map(1->"Toyota", 2->"Chevrolet")     //> mapa1  : scala.collection.immutable.Map[Int,String] = Map(1 -> Toyota, 2 ->
                                                  //|  Chevrolet)
 val mapa2 = Map(3->"Kia")                        //> mapa2  : scala.collection.immutable.Map[Int,String] = Map(3 -> Kia)
 
 mapa1 ++ mapa2                                   //> res31: scala.collection.immutable.Map[Int,String] = Map(1 -> Toyota, 2 -> C
                                                  //| hevrolet, 3 -> Kia)
 val mapaMutable = mutable.Map(1->"Mazda", 2->"Toyota")
                                                  //> mapaMutable  : scala.collection.mutable.Map[Int,String] = Map(2 -> Toyota, 
                                                  //| 1 -> Mazda)
 // add elemento de tres maneras
 mapaMutable += (3->"Chevrolet")                  //> res32: workSheet.mapaMutable.type = Map(2 -> Toyota, 1 -> Mazda, 3 -> Chevr
                                                  //| olet)
 mapaMutable.put(4,"Suzuki")                      //> res33: Option[String] = None
 mapaMutable                                      //> res34: scala.collection.mutable.Map[Int,String] = Map(2 -> Toyota, 4 -> Suz
                                                  //| uki, 1 -> Mazda, 3 -> Chevrolet)
 mapaMutable(5) = "Yamaha"
 mapaMutable                                      //> res35: scala.collection.mutable.Map[Int,String] = Map(2 -> Toyota, 5 -> Yam
                                                  //| aha, 4 -> Suzuki, 1 -> Mazda, 3 -> Chevrolet)
 
 //for each y for
 val lenguajes = Seq("Java", "Scala", ".Net")     //> lenguajes  : Seq[String] = List(Java, Scala, .Net)
 val opinion = Seq ("Bueno", "Malo", "Regular", "aburrido")
                                                  //> opinion  : Seq[String] = List(Bueno, Malo, Regular, aburrido)
 
 lenguajes.foreach(l => println(s"$l es un buen lenguaje"))
                                                  //> Java es un buen lenguaje
                                                  //| Scala es un buen lenguaje
                                                  //| .Net es un buen lenguaje
 lenguajes.foreach(l => opinion.foreach(o => println(s"$l es un lenguaje $o")))
                                                  //> Java es un lenguaje Bueno
                                                  //| Java es un lenguaje Malo
                                                  //| Java es un lenguaje Regular
                                                  //| Java es un lenguaje aburrido
                                                  //| Scala es un lenguaje Bueno
                                                  //| Scala es un lenguaje Malo
                                                  //| Scala es un lenguaje Regular
                                                  //| Scala es un lenguaje aburrido
                                                  //| .Net es un lenguaje Bueno
                                                  //| .Net es un lenguaje Malo
                                                  //| .Net es un lenguaje Regular
                                                  //| .Net es un lenguaje aburrido
 for (l <- lenguajes) {
  println (s"$l es un buen lenguaje")             //> Java es un buen lenguaje
                                                  //| Scala es un buen lenguaje
                                                  //| .Net es un buen lenguaje
 }
 
 for (l <- lenguajes; o <- opinion) {
   println(s"$l es un lenguaje $o")               //> Java es un lenguaje Bueno
                                                  //| Java es un lenguaje Malo
                                                  //| Java es un lenguaje Regular
                                                  //| Java es un lenguaje aburrido
                                                  //| Scala es un lenguaje Bueno
                                                  //| Scala es un lenguaje Malo
                                                  //| Scala es un lenguaje Regular
                                                  //| Scala es un lenguaje aburrido
                                                  //| .Net es un lenguaje Bueno
                                                  //| .Net es un lenguaje Malo
                                                  //| .Net es un lenguaje Regular
                                                  //| .Net es un lenguaje aburrido
 }
 
 for (l <- lenguajes if l.endsWith("a"); o<-opinion if o.startsWith("a")) {
   println(s"$l es un lenguaje $o")               //> Java es un lenguaje aburrido
                                                  //| Scala es un lenguaje aburrido
 }


  
}
import scala.collection.immutable
import scala.collection.mutable
import scala.collection.mutable.Buffer

object workSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(132); val res$0 = 
  2 + 2;System.out.println("""res0: Int(4) = """ + $show(res$0));$skip(24); 
  println("Hola mundo");$skip(13); 
  
  val n=5;System.out.println("""n  : Int = """ + $show(n ));$skip(57); 
  
  if (n == 5) {
    println ("Si, n vale 5")
    
  };$skip(17); 
 
 
 var mes = 6;System.out.println("""mes  : Int = """ + $show(mes ));$skip(202); val res$1 = 
 
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
 };System.out.println("""res1: String = """ + $show(res$1));$skip(14); 
  
 var k = 0;System.out.println("""k  : Int = """ + $show(k ));$skip(82); 
 while (k < 20) {
   k= k+1
   println(s"k vale $k (el siguiente es ${k+1})" )
 };$skip(57); 
  
val frutas = Array ("manzana","pera","limon","mango");System.out.println("""frutas  : Array[String] = """ + $show(frutas ));$skip(21); val res$2 = 
  
  frutas.apply(2);System.out.println("""res2: String = """ + $show(res$2));$skip(12); val res$3 = 
  frutas(1);System.out.println("""res3: String = """ + $show(res$3));$skip(15); val res$4 = 
  
  frutas(3);System.out.println("""res4: String = """ + $show(res$4));$skip(16); val res$5 = 
  frutas.length;System.out.println("""res5: Int = """ + $show(res$5));$skip(49); 
  
  
  var numeros = List(1,2,3,4,5,6,7,8,9,10);System.out.println("""numeros  : List[Int] = """ + $show(numeros ));$skip(36); 
  
  def doble  (a:Int) : Int = 2*a;System.out.println("""doble: (a: Int)Int""");$skip(33); val res$6 = 
  
  numeros.map (x => doble(x));System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(62); 
  
  var marcas = List("Toyota", "Chevrolet", "Mazda", "Kia");System.out.println("""marcas  : List[String] = """ + $show(marcas ));$skip(35); val res$7 = 
  marcas.map{m => m.toUpperCase()};System.out.println("""res7: List[String] = """ + $show(res$7));$skip(31); val res$8 = 
  marcas.map (_.toLowerCase());System.out.println("""res8: List[String] = """ + $show(res$8));$skip(58); 
  
  var lista = List(List(2,4), List(6,8,6),List(4,2,1));System.out.println("""lista  : List[List[Int]] = """ + $show(lista ));$skip(19); val res$9 = 
  
  lista.flatten;System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(61); val res$10 = 
  
  
  lista.flatMap { x: List[Int] => x.map {n => 2 * n} };System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(43); val res$11 = 
  marcas.flatMap{_.toUpperCase()}.distinct;System.out.println("""res11: List[Char] = """ + $show(res$11));$skip(30); 
 
 
 val set = Set(1,2,3,4,5);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(9); val res$12 = 
 set + 6;System.out.println("""res12: scala.collection.immutable.Set[Int] = """ + $show(res$12));$skip(23); val res$13 = 
 
 set ++ Set(6,7,8,9);System.out.println("""res13: scala.collection.immutable.Set[Int] = """ + $show(res$13));$skip(71); val res$14 = 
 // intersect y & son lo mismo, ver ejemplo:
 set intersect Set(3,4,6);System.out.println("""res14: scala.collection.immutable.Set[Int] = """ + $show(res$14));$skip(18); val res$15 = 
 set & Set(3,4,6);System.out.println("""res15: scala.collection.immutable.Set[Int] = """ + $show(res$15));$skip(61); val res$16 = 
 
 // union es igual a |, ver ejemplo:
 set union Set(4,5,6);System.out.println("""res16: scala.collection.immutable.Set[Int] = """ + $show(res$16));$skip(18); val res$17 = 
 set | Set(4,5,6);System.out.println("""res17: scala.collection.immutable.Set[Int] = """ + $show(res$17));$skip(63); val res$18 = 
 
 // diferencia es iguala &~, ver ejemplo:
 set diff Set(3,4);System.out.println("""res18: scala.collection.immutable.Set[Int] = """ + $show(res$18));$skip(17); val res$19 = 
 set &~ Set(3,4);System.out.println("""res19: scala.collection.immutable.Set[Int] = """ + $show(res$19));$skip(39); 
 
 val mutSet = mutable.Set(1,2,3,4,5);System.out.println("""mutSet  : scala.collection.mutable.Set[Int] = """ + $show(mutSet ));$skip(21); val res$20 = 
 mutSet ++= Set(6,7);System.out.println("""res20: workSheet.mutSet.type = """ + $show(res$20));$skip(8); val res$21 = 
 mutSet;System.out.println("""res21: scala.collection.mutable.Set[Int] = """ + $show(res$21));$skip(30); 
 
 mutSet retain {x=> x%2==0};$skip(8); val res$22 = 
 mutSet;System.out.println("""res22: scala.collection.mutable.Set[Int] = """ + $show(res$22));$skip(62); 
 
 // ordenar
 val sortedSet = immutable.SortedSet(5,3,2,4,1);System.out.println("""sortedSet  : scala.collection.immutable.SortedSet[Int] = """ + $show(sortedSet ));$skip(53); 
 val mayorAMenor = Ordering.fromLessThan[Int](_ > _);System.out.println("""mayorAMenor  : scala.math.Ordering[Int] = """ + $show(mayorAMenor ));$skip(91); 
 //orden inverso
 val sortedSetIerso = immutable.SortedSet.empty(mayorAMenor) ++ sortedSet;System.out.println("""sortedSetIerso  : scala.collection.immutable.SortedSet[Int] = """ + $show(sortedSetIerso ));$skip(63); 
 // Mapas
 val mapa = Map(1->"Maria", 2->"Pepito", 3->"Matha");System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(11); val res$23 = 
 mapa.keys;System.out.println("""res23: Iterable[Int] = """ + $show(res$23));$skip(13); val res$24 = 
 mapa.values;System.out.println("""res24: Iterable[String] = """ + $show(res$24));$skip(13); val res$25 = 
 mapa.get(2);System.out.println("""res25: Option[String] = """ + $show(res$25));$skip(9); val res$26 = 
 mapa(2);System.out.println("""res26: String = """ + $show(res$26));$skip(15); val res$27 = 
 
 mapa.get(9);System.out.println("""res27: Option[String] = """ + $show(res$27));$skip(53); val res$28 = 
 // mapa(9) error no existe
 mapa.getOrElse(9, null);System.out.println("""res28: String = """ + $show(res$28));$skip(56); val res$29 = 
 
 // mapa operaciones
 mapa + (4->"Luis", 5->"Sandra");System.out.println("""res29: scala.collection.immutable.Map[Int,String] = """ + $show(res$29));$skip(9); val res$30 = 
 mapa -3;System.out.println("""res30: scala.collection.immutable.Map[Int,String] = """ + $show(res$30));$skip(46); 
 val mapa1 = Map(1->"Toyota", 2->"Chevrolet");System.out.println("""mapa1  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa1 ));$skip(27); 
 val mapa2 = Map(3->"Kia");System.out.println("""mapa2  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa2 ));$skip(18); val res$31 = 
 
 mapa1 ++ mapa2;System.out.println("""res31: scala.collection.immutable.Map[Int,String] = """ + $show(res$31));$skip(56); 
 val mapaMutable = mutable.Map(1->"Mazda", 2->"Toyota");System.out.println("""mapaMutable  : scala.collection.mutable.Map[Int,String] = """ + $show(mapaMutable ));$skip(66); val res$32 = 
 // add elemento de tres maneras
 mapaMutable += (3->"Chevrolet");System.out.println("""res32: workSheet.mapaMutable.type = """ + $show(res$32));$skip(29); val res$33 = 
 mapaMutable.put(4,"Suzuki");System.out.println("""res33: Option[String] = """ + $show(res$33));$skip(13); val res$34 = 
 mapaMutable;System.out.println("""res34: scala.collection.mutable.Map[Int,String] = """ + $show(res$34));$skip(27); 
 mapaMutable(5) = "Yamaha";$skip(13); val res$35 = 
 mapaMutable;System.out.println("""res35: scala.collection.mutable.Map[Int,String] = """ + $show(res$35));$skip(66); 
 
 //for each y for
 val lenguajes = Seq("Java", "Scala", ".Net");System.out.println("""lenguajes  : Seq[String] = """ + $show(lenguajes ));$skip(60); 
 val opinion = Seq ("Bueno", "Malo", "Regular", "aburrido");System.out.println("""opinion  : Seq[String] = """ + $show(opinion ));$skip(63); 
 
 lenguajes.foreach(l => println(s"$l es un buen lenguaje"));$skip(80); 
 lenguajes.foreach(l => opinion.foreach(o => println(s"$l es un lenguaje $o")));$skip(62); 
 for (l <- lenguajes) {
  println (s"$l es un buen lenguaje")
 };$skip(78); 
 
 for (l <- lenguajes; o<- opinion) {
   println(s"$l es un lenguaje $o")
 };$skip(117); 
 
 for (l <- lenguajes if l.endsWith("a"); o<-opinion if o.startsWith("a")) {
   println(s"$l es un lenguaje $o")}
 }


  
}

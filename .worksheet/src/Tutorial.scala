import java.math.BigInteger
object Tutorial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 

  def lambda = { x: Int =>
    x + 1
  };System.out.println("""lambda: => Int => Int""");$skip(38); 
  
  def lambda2 = (x: Int) => x + 2;System.out.println("""lambda2: => Int => Int""");$skip(34); 
  val lambda3 = (x: Int) => x + 3;System.out.println("""lambda3  : Int => Int = """ + $show(lambda3 ));$skip(85); 

  val lambda4 = new Function1[Int, Int] {
    def apply(v1: Int): Int = v1 - 1
  };System.out.println("""lambda4  : Int => Int = """ + $show(lambda4 ));$skip(32); 

  def lambda5(x: Int) = x + 1;System.out.println("""lambda5: (x: Int)Int""");$skip(27); 

  val result = lambda(3);System.out.println("""result  : Int = """ + $show(result ));$skip(41); 
  val `result1andhalf` = lambda.apply(3);System.out.println("""result1andhalf  : Int = """ + $show(result1andhalf ));$skip(29); 

  val result2 = lambda2(3);System.out.println("""result2  : Int = """ + $show(result2 ));$skip(27); 
  val result3 = lambda3(3);System.out.println("""result3  : Int = """ + $show(result3 ));$skip(27); 
  val result4 = lambda4(3);System.out.println("""result4  : Int = """ + $show(result4 ));$skip(27); 
  val result5 = lambda5(3);System.out.println("""result5  : Int = """ + $show(result5 ));$skip(143); 
  
  def addWithoutSyntaxSugar(x: Int): Function1[Int, Int] = {
    new Function1[Int, Int]() {
      def apply(y: Int): Int = x + y
    }
  };System.out.println("""addWithoutSyntaxSugar: (x: Int)Int => Int""");$skip(64); val res$0 = 
  
  addWithoutSyntaxSugar(1).isInstanceOf[Function1[Int, Int]];System.out.println("""res0: Boolean = """ + $show(res$0));$skip(27); val res$1 = 
  addWithoutSyntaxSugar(1);System.out.println("""res1: Int => Int = """ + $show(res$1));$skip(30); val res$2 = 
  addWithoutSyntaxSugar(2)(3);System.out.println("""res2: Int = """ + $show(res$2));$skip(56); 
  
  def addWithSyntaxSugar2(x: Int) = (y: Int) ⇒ x + y;System.out.println("""addWithSyntaxSugar2: (x: Int)Int => Int""");$skip(55); val res$3 = 
  addWithSyntaxSugar2(1).isInstanceOf[Function1[_, _]];System.out.println("""res3: Boolean = """ + $show(res$3));$skip(67); 
  def makeUpper(xs: List[String]) = xs map {
    _.toUpperCase
  };System.out.println("""makeUpper: (xs: List[String])List[String]""");$skip(42); val res$4 = 
  
  makeUpper(List("abc", "xyz", "123"));System.out.println("""res4: List[String] = """ + $show(res$4));$skip(98); 
  
  def makeWhatEverYouLike(xs: List[String], sideEffect: String ⇒ String) =
  xs map sideEffect;System.out.println("""makeWhatEverYouLike: (xs: List[String], sideEffect: String => String)List[String]""");$skip(40); val res$5 = 

  makeUpper(List("abc", "xyz", "123"));System.out.println("""res5: List[String] = """ + $show(res$5));$skip(73); val res$6 = 

  makeWhatEverYouLike(List("ABC", "XYZ", "123"), { x ⇒  x.toLowerCase});System.out.println("""res6: List[String] = """ + $show(res$6));$skip(55); 


  val myName = (name: String) => s"My name is $name";System.out.println("""myName  : String => String = """ + $show(myName ));$skip(52); val res$7 = 
  makeWhatEverYouLike(List("John", "Mark"), myName);System.out.println("""res7: List[String] = """ + $show(res$7));$skip(54); val res$8 = 
 
  List("Scala", "Erlang", "Clojure") map (_.length);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(39); 
  
  // listas
  val a = List(1, 2, 3);System.out.println("""a  : List[Int] = """ + $show(a ));$skip(24); 
  val b = List(1, 2, 3);System.out.println("""b  : List[Int] = """ + $show(b ));$skip(11); val res$9 = 
  (a eq b);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(11); val res$10 = 
  (a == b);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(32); 
  
  val aa: List[String] = Nil;System.out.println("""aa  : List[String] = """ + $show(aa ));$skip(26); 
  val bb: List[Int] = Nil;System.out.println("""bb  : List[Int] = """ + $show(bb ));$skip(15); val res$11 = 

  (aa == Nil);System.out.println("""res11: Boolean = """ + $show(res$11));$skip(14); val res$12 = 
  (bb == Nil);System.out.println("""res12: Boolean = """ + $show(res$12));$skip(14); val res$13 = 
  (bb eq Nil);System.out.println("""res13: Boolean = """ + $show(res$13));$skip(13); val res$14 = 
  (aa == bb);System.out.println("""res14: Boolean = """ + $show(res$14));$skip(13); val res$15 = 
  (aa eq bb);System.out.println("""res15: Boolean = """ + $show(res$15));$skip(18); val res$16 = 
  
  a.headOption;System.out.println("""res16: Option[Int] = """ + $show(res$16));$skip(9); val res$17 = 
  a.tail;System.out.println("""res17: List[Int] = """ + $show(res$17));$skip(13); 
  println(a);$skip(7); val res$18 = 
  a(0);System.out.println("""res18: Int = """ + $show(res$18));$skip(27); val res$19 = 
  
 
  a.reduceLeft(_ + _);System.out.println("""res19: Int = """ + $show(res$19));$skip(33); 
 
  val alist = List(1, 3, 5, 7);System.out.println("""alist  : List[Int] = """ + $show(alist ));$skip(27); val res$20 = 
  alist.foldLeft(0)(_ + _);System.out.println("""res20: Int = """ + $show(res$20));$skip(28); val res$21 = 
  alist.foldLeft(10)(_ + _);System.out.println("""res21: Int = """ + $show(res$21));$skip(27); val res$22 = 
  alist.foldLeft(1)(_ * _);System.out.println("""res22: Int = """ + $show(res$22));$skip(27); val res$23 = 
  alist.foldLeft(0)(_ * _);System.out.println("""res23: Int = """ + $show(res$23));$skip(25); 

  val head = List(1, 3);System.out.println("""head  : List[Int] = """ + $show(head ));$skip(24); 
  val tail = List(5, 7);System.out.println("""tail  : List[Int] = """ + $show(tail ));$skip(17); val res$24 = 

  head ::: tail;System.out.println("""res24: List[Int] = """ + $show(res$24));$skip(108); 
  
  
  // mapas
  val myMap = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "MI" → "Michigan");System.out.println("""myMap  : scala.collection.immutable.Map[String,String] = """ + $show(myMap ));$skip(32); 

  val mapValues = myMap.values;System.out.println("""mapValues  : Iterable[String] = """ + $show(mapValues ));$skip(17); val res$25 = 
  mapValues.size;System.out.println("""res25: Int = """ + $show(res$25));$skip(17); val res$26 = 
  mapValues.head;System.out.println("""res26: String = """ + $show(res$26));$skip(36); 

  val lastElement = mapValues.last;System.out.println("""lastElement  : String = """ + $show(lastElement ));$skip(17); val res$27 = 
  
  myMap("MI");System.out.println("""res27: String = """ + $show(res$27));$skip(61); 
   
   
  val myMap2 = Map("Ann Arbor" → "MI", 49931 → "MI");System.out.println("""myMap2  : scala.collection.immutable.Map[Any,String] = """ + $show(myMap2 ));$skip(22); val res$28 = 
  myMap2("Ann Arbor");System.out.println("""res28: String = """ + $show(res$28));$skip(16); val res$29 = 
  myMap2(49931);System.out.println("""res29: String = """ + $show(res$29));$skip(90); 

  val myMap3 = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa");System.out.println("""myMap3  : scala.collection.immutable.Map[String,String] = """ + $show(myMap3 ));$skip(110); val res$30 = 
  //intercept[NoSuchElementException] {
    //myMap3("TX")
  //}
  
  myMap3.getOrElse("TX", "missing data");System.out.println("""res30: String = """ + $show(res$30));$skip(122); 

  val myMap4 = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa") withDefaultValue "missing data";System.out.println("""myMap4  : scala.collection.immutable.Map[String,String] = """ + $show(myMap4 ));$skip(15); val res$31 = 
  myMap4("TX");System.out.println("""res31: String = """ + $show(res$31));$skip(96); 
  
  
  val myMap5 =   Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa");System.out.println("""myMap5  : scala.collection.immutable.Map[String,String] = """ + $show(myMap5 ));$skip(31); 
  val aNewMap5 = myMap5 - "MN";System.out.println("""aNewMap5  : scala.collection.immutable.Map[String,String] = """ + $show(aNewMap5 ));$skip(27); val res$32 = 

  aNewMap5.equals(myMap5);System.out.println("""res32: Boolean = """ + $show(res$32));$skip(90); 

  val myMap6 = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa");System.out.println("""myMap6  : scala.collection.immutable.Map[String,String] = """ + $show(myMap6 ));$skip(88); 
  val myMap7 = Map("WI" → "Wisconsin", "MI" → "Michigan", "IA" → "Iowa", "OH" → "Ohio");System.out.println("""myMap7  : scala.collection.immutable.Map[String,String] = """ + $show(myMap7 ));$skip(26); val res$33 = 

  myMap6.equals(myMap7);System.out.println("""res33: Boolean = """ + $show(res$33));$skip(54); 
  
  // set
  val mySet = Set("Michigan", "Ohio", 12);System.out.println("""mySet  : scala.collection.immutable.Set[Any] = """ + $show(mySet ));$skip(12); val res$34 = 
  mySet(12);System.out.println("""res34: Boolean = """ + $show(res$34));$skip(14); val res$35 = 
  mySet("MI");System.out.println("""res35: Boolean = """ + $show(res$35));$skip(48); 
  
  // formateo - formatting
  val achar = 'a';System.out.println("""achar  : Char = """ + $show(achar ));$skip(18); 
  val bchar = 'B';System.out.println("""bchar  : Char = """ + $show(bchar ));$skip(21); val res$36 = 
  "%c".format(achar);System.out.println("""res36: String = """ + $show(res$36));$skip(21); val res$37 = 
  "%c".format(bchar);System.out.println("""res37: String = """ + $show(res$37));$skip(21); 
  
  val cchar = 'a';System.out.println("""cchar  : Char = """ + $show(cchar ));$skip(21); 
  val dchar = '\141';System.out.println("""dchar  : Char = """ + $show(dchar ));$skip(19); 
  val echar = '\"';System.out.println("""echar  : Char = """ + $show(echar ));$skip(19); 
  val fchar = '\\';System.out.println("""fchar  : Char = """ + $show(fchar ));$skip(21); val res$38 = 
  "%c".format(cchar);System.out.println("""res38: String = """ + $show(res$38));$skip(21); val res$39 = 
  "%c".format(dchar);System.out.println("""res39: String = """ + $show(res$39));$skip(21); val res$40 = 
  "%c".format(echar);System.out.println("""res40: String = """ + $show(res$40));$skip(21); val res$41 = 
  "%c".format(fchar);System.out.println("""res41: String = """ + $show(res$41));$skip(24); 
  
  println ("\"Hola");$skip(16); 
  println("\"");$skip(16); 
  println("\\");$skip(17); 
  
  val j = 190;System.out.println("""j  : Int = """ + $show(j ));$skip(50); val res$42 = 
  "%d bottles of beer on the wall" format j - 100;System.out.println("""res42: String = """ + $show(res$42));$skip(41); 
  
  
  // patrones
  val stuff = "blue";System.out.println("""stuff  : String = """ + $show(stuff ));$skip(229); 

val myStuff = stuff match {
  case "red" ⇒
    println("RED"); 1
  case "blue" ⇒
    println("BLUE"); 2
  case "green" ⇒
    println("GREEN"); 3
  case _ ⇒
    println(stuff); 0 // case _ will trigger if all other cases fail.
};System.out.println("""myStuff  : Int = """ + $show(myStuff ));$skip(24); 

 
 val stuff2 = "blue";System.out.println("""stuff2  : String = """ + $show(stuff2 ));$skip(169); 

  val myStuff2 = stuff2 match {
    case "red"   ⇒ (255, 0, 0)
    case "green" ⇒ (0, 255, 0)
    case "blue"  ⇒ (0, 0, 255)
    case _       ⇒ println(stuff2); 0
  };System.out.println("""myStuff2  : Any = """ + $show(myStuff2 ));$skip(31); 
  
  val foodItem = "porridge";System.out.println("""foodItem  : String = """ + $show(foodItem ));$skip(201); 
  def goldilocks(expr: Any) = expr match {
    case (`foodItem`, _)   ⇒ "eating"
    case ("chair", "Mama") ⇒ "sitting"
    case ("bed", "Baby")   ⇒ "sleeping"
    case _                 ⇒ "what?"
  };System.out.println("""goldilocks: (expr: Any)String""");$skip(37); val res$43 = 

  goldilocks(("porridge", "Papa"));System.out.println("""res43: String = """ + $show(res$43));$skip(32); val res$44 = 
  goldilocks(("chair", "Mama"));System.out.println("""res44: String = """ + $show(res$44));$skip(37); val res$45 = 
  goldilocks(("porridge", "Cousin"));System.out.println("""res45: String = """ + $show(res$45));$skip(33); val res$46 = 
  goldilocks(("beer", "Cousin"));System.out.println("""res46: String = """ + $show(res$46));$skip(95); 

  def patternEquals(i: Int, j: Int) = j match {
    case `i` ⇒ true
    case _   ⇒ false
  };System.out.println("""patternEquals: (i: Int, j: Int)Boolean""");$skip(26); val res$47 = 
  
  patternEquals(3, 3);System.out.println("""res47: Boolean = """ + $show(res$47));$skip(22); val res$48 = 
  patternEquals(7, 9);System.out.println("""res48: Boolean = """ + $show(res$48));$skip(22); val res$49 = 
  patternEquals(9, 9);System.out.println("""res49: Boolean = """ + $show(res$49));$skip(98); 

  val secondElement = List(1, 2, 3) match {
    case x :: xs ⇒ xs.head
    case _       ⇒ 0
  };System.out.println("""secondElement  : Int = """ + $show(secondElement ));$skip(18); val res$50 = 

  secondElement;System.out.println("""res50: Int = """ + $show(res$50));$skip(103); 

  val secondElement2 = List(1, 2, 3) match {
    case x :: y :: xs ⇒ y
    case _            ⇒ 0
  };System.out.println("""secondElement2  : Int = """ + $show(secondElement2 ));$skip(17); val res$51 = 
  secondElement2;System.out.println("""res51: Int = """ + $show(res$51));$skip(103); 

  val secondElement3 = List(1, 2, 3) match {
    case x :: y :: xs ⇒ y
    case _            ⇒ 0
  };System.out.println("""secondElement3  : Int = """ + $show(secondElement3 ));$skip(17); val res$52 = 
  secondElement3;System.out.println("""res52: Int = """ + $show(res$52));$skip(143); 

  val secondElement4 = List(1) match {
    case x :: y :: xs ⇒ y // only matches a list with two or more items
    case _            ⇒ 0
  };System.out.println("""secondElement4  : Int = """ + $show(secondElement4 ));$skip(19); val res$53 = 

  secondElement4

  // clases
  case class Person(first: String, last: String);System.out.println("""res53: Int = """ + $show(res$53));$skip(104); 

  val p1 = new Person("Fred", "Jones");System.out.println("""p1  : Tutorial.Person = """ + $show(p1 ));$skip(42); 
  val p2 = new Person("Shaggy", "Rogers");System.out.println("""p2  : Tutorial.Person = """ + $show(p2 ));$skip(39); 
  val p3 = new Person("Fred", "Jones");System.out.println("""p3  : Tutorial.Person = """ + $show(p3 ));$skip(15); val res$54 = 

  (p1 == p2);System.out.println("""res54: Boolean = """ + $show(res$54));$skip(13); val res$55 = 
  (p1 == p3);System.out.println("""res55: Boolean = """ + $show(res$55));$skip(13); val res$56 = 
  (p1 eq p2);System.out.println("""res56: Boolean = """ + $show(res$56));$skip(13); val res$57 = 
  (p1 eq p3)

  //clases metodo hashcode
  case class Person2(first: String, last: String);System.out.println("""res57: Boolean = """ + $show(res$57));$skip(122); 

  val pe1 = new Person2("Fred", "Jones");System.out.println("""pe1  : Tutorial.Person2 = """ + $show(pe1 ));$skip(44); 
  val pe2 = new Person2("Shaggy", "Rogers");System.out.println("""pe2  : Tutorial.Person2 = """ + $show(pe2 ));$skip(41); 
  val pe3 = new Person2("Fred", "Jones");System.out.println("""pe3  : Tutorial.Person2 = """ + $show(pe3 ));$skip(35); val res$58 = 

  (pe1.hashCode == pe2.hashCode);System.out.println("""res58: Boolean = """ + $show(res$58));$skip(33); val res$59 = 
  (pe1.hashCode == pe3.hashCode)

  case class Dog(name: String, breed: String);System.out.println("""res59: Boolean = """ + $show(res$59));$skip(85); 
  val d1 = Dog("Scooby", "Doberman");System.out.println("""d1  : Tutorial.Dog = """ + $show(d1 ));$skip(14); val res$60 = 
  d1.toString

  case class Dog4(name: String, breed: String);System.out.println("""res60: String = """ + $show(res$60));$skip(102);  // Doberman

  val do1 = Dog4("Scooby", "Doberman");System.out.println("""do1  : Tutorial.Dog4 = """ + $show(do1 ));$skip(97); 
  val do2 = do1.copy(name = "Scooby Doo");System.out.println("""do2  : Tutorial.Dog4 = """ + $show(do2 ));$skip(48);  // copy the case class but change the name in the copy

  def sum(a: Int, b: Int, c: Int) = a + b + c;System.out.println("""sum: (a: Int, b: Int, c: Int)Int""");$skip(32); 
  val sumC = sum(1, 10, _: Int);System.out.println("""sumC  : Int => Int = """ + $show(sumC ));$skip(10); val res$61 = 
  sumC(4);System.out.println("""res61: Int = """ + $show(res$61));$skip(15); val res$62 = 
  sum(4, 5, 6);System.out.println("""res62: Int = """ + $show(res$62));$skip(41); 

  def multiply(x: Int, y: Int) = x * y;System.out.println("""multiply: (x: Int, y: Int)Int""");$skip(48); val res$63 = 
  (multiply _).isInstanceOf[Function2[_, _, _]];System.out.println("""res63: Boolean = """ + $show(res$63));$skip(47); 

  val multiplyCurried = (multiply _).curried;System.out.println("""multiplyCurried  : Int => (Int => Int) = """ + $show(multiplyCurried ));$skip(17); val res$64 = 
  multiply(4, 5);System.out.println("""res64: Int = """ + $show(res$64));$skip(24); val res$65 = 
  multiplyCurried(3)(2);System.out.println("""res65: Int = """ + $show(res$65));$skip(47); 
  val multiplyCurriedFour = multiplyCurried(4);System.out.println("""multiplyCurriedFour  : Int => Int = """ + $show(multiplyCurriedFour ));$skip(25); val res$66 = 
  multiplyCurriedFour(2);System.out.println("""res66: Int = """ + $show(res$66));$skip(25); val res$67 = 
  multiplyCurriedFour(4);System.out.println("""res67: Int = """ + $show(res$67));$skip(311); 

  // funciones parciales
  val doubleEvens: PartialFunction[Int, Int] =
    new PartialFunction[Int, Int] {
      //States that this partial function will take on the task
      def isDefinedAt(x: Int) = x % 2 == 0

      //What we do if this partial function matches
      def apply(v1: Int) = v1 * 2
    };System.out.println("""doubleEvens  : PartialFunction[Int,Int] = """ + $show(doubleEvens ));$skip(159); 

  val tripleOdds: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
    def isDefinedAt(x: Int) = x % 2 != 0

    def apply(v1: Int) = v1 * 3
  };System.out.println("""tripleOdds  : PartialFunction[Int,Int] = """ + $show(tripleOdds ));$skip(96); 

  val whatToDo = doubleEvens orElse tripleOdds;System.out.println("""whatToDo  : PartialFunction[Int,Int] = """ + $show(whatToDo ));$skip(16); val res$68 =  //Here we chain the partial functions together

  whatToDo(3);System.out.println("""res68: Int = """ + $show(res$68));$skip(14); val res$69 = 
  whatToDo(4)

  // implicitos
  import java.math.BigInteger;System.out.println("""res69: Int = """ + $show(res$69));$skip(146); 
  implicit def Int2BigIntegerConvert(value: Int): BigInteger =
    new BigInteger(value.toString);System.out.println("""Int2BigIntegerConvert: (value: Int)java.math.BigInteger""");$skip(51); 
  def add(a: BigInteger, b: BigInteger) = a.add(b);System.out.println("""add: (a: java.math.BigInteger, b: java.math.BigInteger)java.math.BigInteger""");$skip(88); val res$70 = 

  add(Int2BigIntegerConvert(3), Int2BigIntegerConvert(6)) == Int2BigIntegerConvert(9);System.out.println("""res70: Boolean = """ + $show(res$70));$skip(103); 
  
  def howMuchCanIMake_?(hours: Int)(implicit dollarsPerHour: BigDecimal) =
  dollarsPerHour * hours;System.out.println("""howMuchCanIMake_? : (hours: Int)(implicit dollarsPerHour: BigDecimal)scala.math.BigDecimal""");$skip(45); 

  implicit val hourlyRate = BigDecimal(34);System.out.println("""hourlyRate  : scala.math.BigDecimal = """ + $show(hourlyRate ));$skip(26); val res$71 = 

  howMuchCanIMake_?(30);System.out.println("""res71: scala.math.BigDecimal = """ + $show(res$71));$skip(46); 

  // for expressions
  val xValues = 1 to 4;System.out.println("""xValues  : scala.collection.immutable.Range.Inclusive = """ + $show(xValues ));$skip(23); 
  val yValues = 1 to 2;System.out.println("""yValues  : scala.collection.immutable.Range.Inclusive = """ + $show(yValues ));$skip(75); 
  val coordinates = for {
    x ← xValues
    y ← yValues
  } yield (x, y);System.out.println("""coordinates  : scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(coordinates ));$skip(17); val res$72 = 
  coordinates(1);System.out.println("""res72: (Int, Int) = """ + $show(res$72));$skip(69); 
  
  
  val nums = List(List(1), List(2), List(3), List(4), List(5));System.out.println("""nums  : List[List[Int]] = """ + $show(nums ));$skip(99); 

  val resultf = for {
    numList ← nums
    num ← numList
    if (num % 2 == 0)
  } yield (num);System.out.println("""resultf  : List[Int] = """ + $show(resultf ));$skip(12); val res$73 = 

  resultf;System.out.println("""res73: List[Int] = """ + $show(res$73))}
  
  
  
  
}

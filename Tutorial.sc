import java.math.BigInteger
object Tutorial {

  def lambda = { x: Int =>
    x + 1
  }                                               //> lambda: => Int => Int
  
  def lambda2 = (x: Int) => x + 2                 //> lambda2: => Int => Int
  val lambda3 = (x: Int) => x + 3                 //> lambda3  : Int => Int = Tutorial$$$Lambda$8/483422889@3ac3fd8b

  val lambda4 = new Function1[Int, Int] {
    def apply(v1: Int): Int = v1 - 1
  }                                               //> lambda4  : Int => Int = <function1>

  def lambda5(x: Int) = x + 1                     //> lambda5: (x: Int)Int

  val result = lambda(3)                          //> result  : Int = 4
  val `result1andhalf` = lambda.apply(3)          //> result1andhalf  : Int = 4

  val result2 = lambda2(3)                        //> result2  : Int = 5
  val result3 = lambda3(3)                        //> result3  : Int = 6
  val result4 = lambda4(3)                        //> result4  : Int = 2
  val result5 = lambda5(3)                        //> result5  : Int = 4
  
  def addWithoutSyntaxSugar(x: Int): Function1[Int, Int] = {
    new Function1[Int, Int]() {
      def apply(y: Int): Int = x + y
    }
  }                                               //> addWithoutSyntaxSugar: (x: Int)Int => Int
  
  addWithoutSyntaxSugar(1).isInstanceOf[Function1[Int, Int]]
                                                  //> res0: Boolean = true
  addWithoutSyntaxSugar(1)                        //> res1: Int => Int = <function1>
  addWithoutSyntaxSugar(2)(3)                     //> res2: Int = 5
  
  def addWithSyntaxSugar2(x: Int) = (y: Int) ⇒ x + y
                                                  //> addWithSyntaxSugar2: (x: Int)Int => Int
  addWithSyntaxSugar2(1).isInstanceOf[Function1[_, _]]
                                                  //> res3: Boolean = true
  def makeUpper(xs: List[String]) = xs map {
    _.toUpperCase
  }                                               //> makeUpper: (xs: List[String])List[String]
  
  makeUpper(List("abc", "xyz", "123"))            //> res4: List[String] = List(ABC, XYZ, 123)
  
  def makeWhatEverYouLike(xs: List[String], sideEffect: String ⇒ String) =
  xs map sideEffect                               //> makeWhatEverYouLike: (xs: List[String], sideEffect: String => String)List[S
                                                  //| tring]

  makeUpper(List("abc", "xyz", "123"))            //> res5: List[String] = List(ABC, XYZ, 123)

  makeWhatEverYouLike(List("ABC", "XYZ", "123"), { x ⇒  x.toLowerCase})
                                                  //> res6: List[String] = List(abc, xyz, 123)


  val myName = (name: String) => s"My name is $name"
                                                  //> myName  : String => String = Tutorial$$$Lambda$17/1798286609@79698539
  makeWhatEverYouLike(List("John", "Mark"), myName)
                                                  //> res7: List[String] = List(My name is John, My name is Mark)
 
  List("Scala", "Erlang", "Clojure") map (_.length)
                                                  //> res8: List[Int] = List(5, 6, 7)
  
  // listas
  val a = List(1, 2, 3)                           //> a  : List[Int] = List(1, 2, 3)
  val b = List(1, 2, 3)                           //> b  : List[Int] = List(1, 2, 3)
  (a eq b)                                        //> res9: Boolean = false
  (a == b)                                        //> res10: Boolean = true
  
  val aa: List[String] = Nil                      //> aa  : List[String] = List()
  val bb: List[Int] = Nil                         //> bb  : List[Int] = List()

  (aa == Nil)                                     //> res11: Boolean = true
  (bb == Nil)                                     //> res12: Boolean = true
  (bb eq Nil)                                     //> res13: Boolean = true
  (aa == bb)                                      //> res14: Boolean = true
  (aa eq bb)                                      //> res15: Boolean = true
  
  a.headOption                                    //> res16: Option[Int] = Some(1)
  a.tail                                          //> res17: List[Int] = List(2, 3)
  println(a)                                      //> List(1, 2, 3)
  a(0)                                            //> res18: Int = 1
  
 
  a.reduceLeft(_ + _)                             //> res19: Int = 6
 
  val alist = List(1, 3, 5, 7)                    //> alist  : List[Int] = List(1, 3, 5, 7)
  alist.foldLeft(0)(_ + _)                        //> res20: Int = 16
  alist.foldLeft(10)(_ + _)                       //> res21: Int = 26
  alist.foldLeft(1)(_ * _)                        //> res22: Int = 105
  alist.foldLeft(0)(_ * _)                        //> res23: Int = 0

  val head = List(1, 3)                           //> head  : List[Int] = List(1, 3)
  val tail = List(5, 7)                           //> tail  : List[Int] = List(5, 7)

  head ::: tail                                   //> res24: List[Int] = List(1, 3, 5, 7)
  
  
  // mapas
  val myMap = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "MI" → "Michigan")
                                                  //> myMap  : scala.collection.immutable.Map[String,String] = Map(MI -> Michigan
                                                  //| , OH -> Ohio, WI -> Wisconsin)

  val mapValues = myMap.values                    //> mapValues  : Iterable[String] = MapLike.DefaultValuesIterable(Michigan, Ohi
                                                  //| o, Wisconsin)
  mapValues.size                                  //> res25: Int = 3
  mapValues.head                                  //> res26: String = Michigan

  val lastElement = mapValues.last                //> lastElement  : String = Wisconsin
  
  myMap("MI")                                     //> res27: String = Michigan
   
   
  val myMap2 = Map("Ann Arbor" → "MI", 49931 → "MI")
                                                  //> myMap2  : scala.collection.immutable.Map[Any,String] = Map(Ann Arbor -> MI,
                                                  //|  49931 -> MI)
  myMap2("Ann Arbor")                             //> res28: String = MI
  myMap2(49931)                                   //> res29: String = MI

  val myMap3 = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa")
                                                  //> myMap3  : scala.collection.immutable.Map[String,String] = Map(MI -> Michiga
                                                  //| n, OH -> Ohio, WI -> Wisconsin, IA -> Iowa)
  //intercept[NoSuchElementException] {
    //myMap3("TX")
  //}
  
  myMap3.getOrElse("TX", "missing data")          //> res30: String = missing data

  val myMap4 = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa") withDefaultValue "missing data"
                                                  //> myMap4  : scala.collection.immutable.Map[String,String] = Map(MI -> Michiga
                                                  //| n, OH -> Ohio, WI -> Wisconsin, IA -> Iowa)
  myMap4("TX")                                    //> res31: String = missing data
  
  
  val myMap5 =   Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa")
                                                  //> myMap5  : scala.collection.immutable.Map[String,String] = Map(MI -> Michiga
                                                  //| n, OH -> Ohio, WI -> Wisconsin, IA -> Iowa)
  val aNewMap5 = myMap5 - "MN"                    //> aNewMap5  : scala.collection.immutable.Map[String,String] = Map(MI -> Michi
                                                  //| gan, OH -> Ohio, WI -> Wisconsin, IA -> Iowa)

  aNewMap5.equals(myMap5)                         //> res32: Boolean = true

  val myMap6 = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa")
                                                  //> myMap6  : scala.collection.immutable.Map[String,String] = Map(MI -> Michiga
                                                  //| n, OH -> Ohio, WI -> Wisconsin, IA -> Iowa)
  val myMap7 = Map("WI" → "Wisconsin", "MI" → "Michigan", "IA" → "Iowa", "OH" → "Ohio")
                                                  //> myMap7  : scala.collection.immutable.Map[String,String] = Map(WI -> Wiscons
                                                  //| in, MI -> Michigan, IA -> Iowa, OH -> Ohio)

  myMap6.equals(myMap7)                           //> res33: Boolean = true
  
  // set
  val mySet = Set("Michigan", "Ohio", 12)         //> mySet  : scala.collection.immutable.Set[Any] = Set(Michigan, Ohio, 12)
  mySet(12)                                       //> res34: Boolean = true
  mySet("MI")                                     //> res35: Boolean = false
  
  // formateo - formatting
  val achar = 'a'                                 //> achar  : Char = a
  val bchar = 'B'                                 //> bchar  : Char = B
  "%c".format(achar)                              //> res36: String = a
  "%c".format(bchar)                              //> res37: String = B
  
  val cchar = 'a'                                 //> cchar  : Char = a
  val dchar = '\141'                              //> dchar  : Char = a
  val echar = '\"'                                //> echar  : Char = "
  val fchar = '\\'                                //> fchar  : Char = \
  "%c".format(cchar)                              //> res38: String = a
  "%c".format(dchar)                              //> res39: String = a
  "%c".format(echar)                              //> res40: String = "
  "%c".format(fchar)                              //> res41: String = \
  
  println ("\"Hola")                              //> "Hola
  println("\"")                                   //> "
  println("\\")                                   //> \
  
  val j = 190                                     //> j  : Int = 190
  "%d bottles of beer on the wall" format j - 100 //> res42: String = 90 bottles of beer on the wall
  
  
  // patrones
  val stuff = "blue"                              //> stuff  : String = blue

val myStuff = stuff match {
  case "red" ⇒
    println("RED"); 1
  case "blue" ⇒
    println("BLUE"); 2
  case "green" ⇒
    println("GREEN"); 3
  case _ ⇒
    println(stuff); 0 // case _ will trigger if all other cases fail.
}                                                 //> BLUE
                                                  //| myStuff  : Int = 2

 
 val stuff2 = "blue"                              //> stuff2  : String = blue

  val myStuff2 = stuff2 match {
    case "red"   ⇒ (255, 0, 0)
    case "green" ⇒ (0, 255, 0)
    case "blue"  ⇒ (0, 0, 255)
    case _       ⇒ println(stuff2); 0
  }                                               //> myStuff2  : Any = (0,0,255)
  
  val foodItem = "porridge"                       //> foodItem  : String = porridge
  def goldilocks(expr: Any) = expr match {
    case (`foodItem`, _)   ⇒ "eating"
    case ("chair", "Mama") ⇒ "sitting"
    case ("bed", "Baby")   ⇒ "sleeping"
    case _                 ⇒ "what?"
  }                                               //> goldilocks: (expr: Any)String

  goldilocks(("porridge", "Papa"))                //> res43: String = eating
  goldilocks(("chair", "Mama"))                   //> res44: String = sitting
  goldilocks(("porridge", "Cousin"))              //> res45: String = eating
  goldilocks(("beer", "Cousin"))                  //> res46: String = what?

  def patternEquals(i: Int, j: Int) = j match {
    case `i` ⇒ true
    case _   ⇒ false
  }                                               //> patternEquals: (i: Int, j: Int)Boolean
  
  patternEquals(3, 3)                             //> res47: Boolean = true
  patternEquals(7, 9)                             //> res48: Boolean = false
  patternEquals(9, 9)                             //> res49: Boolean = true

  val secondElement = List(1, 2, 3) match {
    case x :: xs ⇒ xs.head
    case _       ⇒ 0
  }                                               //> secondElement  : Int = 2

  secondElement                                   //> res50: Int = 2

  val secondElement2 = List(1, 2, 3) match {
    case x :: y :: xs ⇒ y
    case _            ⇒ 0
  }                                               //> secondElement2  : Int = 2
  secondElement2                                  //> res51: Int = 2

  val secondElement3 = List(1, 2, 3) match {
    case x :: y :: xs ⇒ y
    case _            ⇒ 0
  }                                               //> secondElement3  : Int = 2
  secondElement3                                  //> res52: Int = 2

  val secondElement4 = List(1) match {
    case x :: y :: xs ⇒ y // only matches a list with two or more items
    case _            ⇒ 0
  }                                               //> secondElement4  : Int = 0

  secondElement4                                  //> res53: Int = 0

  // clases
  case class Person(first: String, last: String)

  val p1 = new Person("Fred", "Jones")            //> p1  : Tutorial.Person = Person(Fred,Jones)
  val p2 = new Person("Shaggy", "Rogers")         //> p2  : Tutorial.Person = Person(Shaggy,Rogers)
  val p3 = new Person("Fred", "Jones")            //> p3  : Tutorial.Person = Person(Fred,Jones)

  (p1 == p2)                                      //> res54: Boolean = false
  (p1 == p3)                                      //> res55: Boolean = true
  (p1 eq p2)                                      //> res56: Boolean = false
  (p1 eq p3)                                      //> res57: Boolean = false

  //clases metodo hashcode
  case class Person2(first: String, last: String)

  val pe1 = new Person2("Fred", "Jones")          //> pe1  : Tutorial.Person2 = Person2(Fred,Jones)
  val pe2 = new Person2("Shaggy", "Rogers")       //> pe2  : Tutorial.Person2 = Person2(Shaggy,Rogers)
  val pe3 = new Person2("Fred", "Jones")          //> pe3  : Tutorial.Person2 = Person2(Fred,Jones)

  (pe1.hashCode == pe2.hashCode)                  //> res58: Boolean = false
  (pe1.hashCode == pe3.hashCode)                  //> res59: Boolean = true

  case class Dog(name: String, breed: String)
  val d1 = Dog("Scooby", "Doberman")              //> d1  : Tutorial.Dog = Dog(Scooby,Doberman)
  d1.toString                                     //> res60: String = Dog(Scooby,Doberman)

  case class Dog4(name: String, breed: String) // Doberman

  val do1 = Dog4("Scooby", "Doberman")            //> do1  : Tutorial.Dog4 = Dog4(Scooby,Doberman)
  val do2 = do1.copy(name = "Scooby Doo") // copy the case class but change the name in the copy
                                                  //> do2  : Tutorial.Dog4 = Dog4(Scooby Doo,Doberman)

  def sum(a: Int, b: Int, c: Int) = a + b + c     //> sum: (a: Int, b: Int, c: Int)Int
  val sumC = sum(1, 10, _: Int)                   //> sumC  : Int => Int = Tutorial$$$Lambda$33/1757676444@ae45eb6
  sumC(4)                                         //> res61: Int = 15
  sum(4, 5, 6)                                    //> res62: Int = 15

  def multiply(x: Int, y: Int) = x * y            //> multiply: (x: Int, y: Int)Int
  (multiply _).isInstanceOf[Function2[_, _, _]]   //> res63: Boolean = true

  val multiplyCurried = (multiply _).curried      //> multiplyCurried  : Int => (Int => Int) = scala.Function2$$Lambda$36/1204167
                                                  //| 249@3e6fa38a
  multiply(4, 5)                                  //> res64: Int = 20
  multiplyCurried(3)(2)                           //> res65: Int = 6
  val multiplyCurriedFour = multiplyCurried(4)    //> multiplyCurriedFour  : Int => Int = scala.Function2$$Lambda$37/1722023916@7
                                                  //| 7caeb3e
  multiplyCurriedFour(2)                          //> res66: Int = 8
  multiplyCurriedFour(4)                          //> res67: Int = 16

  // funciones parciales
  val doubleEvens: PartialFunction[Int, Int] =
    new PartialFunction[Int, Int] {
      //States that this partial function will take on the task
      def isDefinedAt(x: Int) = x % 2 == 0

      //What we do if this partial function matches
      def apply(v1: Int) = v1 * 2
    }                                             //> doubleEvens  : PartialFunction[Int,Int] = <function1>

  val tripleOdds: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
    def isDefinedAt(x: Int) = x % 2 != 0

    def apply(v1: Int) = v1 * 3
  }                                               //> tripleOdds  : PartialFunction[Int,Int] = <function1>

  val whatToDo = doubleEvens orElse tripleOdds //Here we chain the partial functions together
                                                  //> whatToDo  : PartialFunction[Int,Int] = <function1>

  whatToDo(3)                                     //> res68: Int = 9
  whatToDo(4)                                     //> res69: Int = 8

  // implicitos
  import java.math.BigInteger
  implicit def Int2BigIntegerConvert(value: Int): BigInteger =
    new BigInteger(value.toString)                //> Int2BigIntegerConvert: (value: Int)java.math.BigInteger
  def add(a: BigInteger, b: BigInteger) = a.add(b)//> add: (a: java.math.BigInteger, b: java.math.BigInteger)java.math.BigInteger
                                                  //| 

  add(Int2BigIntegerConvert(3), Int2BigIntegerConvert(6)) == Int2BigIntegerConvert(9)
                                                  //> res70: Boolean = true
  
  def howMuchCanIMake_?(hours: Int)(implicit dollarsPerHour: BigDecimal) =
  dollarsPerHour * hours                          //> howMuchCanIMake_? : (hours: Int)(implicit dollarsPerHour: BigDecimal)scala.
                                                  //| math.BigDecimal

  implicit val hourlyRate = BigDecimal(34)        //> hourlyRate  : scala.math.BigDecimal = 34

  howMuchCanIMake_?(30)                           //> res71: scala.math.BigDecimal = 1020

  // for expressions
  val xValues = 1 to 4                            //> xValues  : scala.collection.immutable.Range.Inclusive = Range 1 to 4
  val yValues = 1 to 2                            //> yValues  : scala.collection.immutable.Range.Inclusive = Range 1 to 2
  val coordinates = for {
    x ← xValues
    y ← yValues
  } yield (x, y)                                  //> coordinates  : scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((
                                                  //| 1,1), (1,2), (2,1), (2,2), (3,1), (3,2), (4,1), (4,2))
  coordinates(1)                                  //> res72: (Int, Int) = (1,2)
  
  
  val nums = List(List(1), List(2), List(3), List(4), List(5))
                                                  //> nums  : List[List[Int]] = List(List(1), List(2), List(3), List(4), List(5))
                                                  //| 

  val resultf = for {
    numList ← nums
    num ← numList
    if (num % 2 == 0)
  } yield (num)                                   //> resultf  : List[Int] = List(2, 4)

  resultf                                         //> res73: List[Int] = List(2, 4)
  
  
  
  
}
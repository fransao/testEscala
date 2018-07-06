object TutorialRango {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 
  val someNumbers = Range(0, 10);System.out.println("""someNumbers  : scala.collection.immutable.Range = """ + $show(someNumbers ));$skip(30); 
  val second = someNumbers(1);System.out.println("""second  : Int = """ + $show(second ));$skip(30); 
  val last = someNumbers.last;System.out.println("""last  : Int = """ + $show(last ));$skip(29); 

  println(someNumbers.tail);$skip(19); val res$0 = 
  someNumbers.size;System.out.println("""res0: Int = """ + $show(res$0));$skip(9); val res$1 = 
  second;System.out.println("""res1: Int = """ + $show(res$1));$skip(7); val res$2 = 
  last;System.out.println("""res2: Int = """ + $show(res$2));$skip(39); 

  val someNumbers2 = Range(2, 10, 3);System.out.println("""someNumbers2  : scala.collection.immutable.Range = """ + $show(someNumbers2 ));$skip(32); 
  val second2 = someNumbers2(1);System.out.println("""second2  : Int = """ + $show(second2 ));$skip(32); 
  val last2 = someNumbers2.last;System.out.println("""last2  : Int = """ + $show(last2 ));$skip(16); val res$3 = 

  someNumbers2;System.out.println("""res3: scala.collection.immutable.Range = """ + $show(res$3));$skip(20); val res$4 = 
  someNumbers2.size;System.out.println("""res4: Int = """ + $show(res$4));$skip(10); val res$5 = 
  second2;System.out.println("""res5: Int = """ + $show(res$5));$skip(8); val res$6 = 
  last2;System.out.println("""res6: Int = """ + $show(res$6));$skip(39); 

  val someNumbers3 = Range(0, 34, 2);System.out.println("""someNumbers3  : scala.collection.immutable.Range = """ + $show(someNumbers3 ));$skip(28); val res$7 = 
  someNumbers3.contains(33);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(28); val res$8 = 
  someNumbers3.contains(32);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(28); val res$9 = 
  someNumbers3.contains(34);System.out.println("""res9: Boolean = """ + $show(res$9))}
  
  
  
}

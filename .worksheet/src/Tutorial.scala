object Tutorial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 

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
  };System.out.println("""addWithoutSyntaxSugar: (x: Int)Int => Int""")}
  

  
}

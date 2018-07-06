object TutorialRango {
  val someNumbers = Range(0, 10)                  //> someNumbers  : scala.collection.immutable.Range = Range 0 until 10
  val second = someNumbers(1)                     //> second  : Int = 1
  val last = someNumbers.last                     //> last  : Int = 9

  println(someNumbers.tail)                       //> Range 1 until 10
  someNumbers.size                                //> res0: Int = 10
  second                                          //> res1: Int = 1
  last                                            //> res2: Int = 9

  val someNumbers2 = Range(2, 10, 3)              //> someNumbers2  : scala.collection.immutable.Range = inexact Range 2 until 10 
                                                  //| by 3
  val second2 = someNumbers2(1)                   //> second2  : Int = 5
  val last2 = someNumbers2.last                   //> last2  : Int = 8

  someNumbers2                                    //> res3: scala.collection.immutable.Range = inexact Range 2 until 10 by 3
  someNumbers2.size                               //> res4: Int = 3
  second2                                         //> res5: Int = 5
  last2                                           //> res6: Int = 8

  val someNumbers3 = Range(0, 34, 2)              //> someNumbers3  : scala.collection.immutable.Range = Range 0 until 34 by 2
  someNumbers3.contains(33)                       //> res7: Boolean = false
  someNumbers3.contains(32)                       //> res8: Boolean = true
  someNumbers3.contains(34)                       //> res9: Boolean = false
  
  
  
}
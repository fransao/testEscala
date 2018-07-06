object TutorialTrait {
  case class Event(name: String)

trait EventListener {
  def listen(event: Event): String
}

class MyListener extends EventListener {
  def listen(event: Event): String = {
    event match {
      case Event("Moose Stampede") ⇒
        "An unfortunate moose stampede occurred"
      case _ ⇒ "Nothing of importance occurred"
    }
  }
};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(393); 

val myListener = new MyListener;System.out.println("""myListener  : TutorialTrait.MyListener = """ + $show(myListener ));$skip(37); val res$0 = 

myListener.isInstanceOf[MyListener];System.out.println("""res0: Boolean = """ + $show(res$0));$skip(39); val res$1 = 
myListener.isInstanceOf[EventListener];System.out.println("""res1: Boolean = """ + $show(res$1));$skip(29); val res$2 = 
myListener.isInstanceOf[Any];System.out.println("""res2: Boolean = """ + $show(res$2));$skip(32); val res$3 = 
myListener.isInstanceOf[AnyRef];System.out.println("""res3: Boolean = """ + $show(res$3))}
}

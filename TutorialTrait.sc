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
}

val myListener = new MyListener                   //> myListener  : TutorialTrait.MyListener = TutorialTrait$MyListener@1a86f2f1

myListener.isInstanceOf[MyListener]               //> res0: Boolean = true
myListener.isInstanceOf[EventListener]            //> res1: Boolean = true
myListener.isInstanceOf[Any]                      //> res2: Boolean = true
myListener.isInstanceOf[AnyRef]                   //> res3: Boolean = true
}
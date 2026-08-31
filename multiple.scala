trait Base {
  def msg: String = "Base"
}

trait A extends Base {
  override def msg: String = "A -> " + super.msg
}

trait B extends Base {
  override def msg: String = "B -> " + super.msg
}

class C extends Base with A with B {
  override def msg: String = "C -> " + super.msg
}

object multiple extends App {
  val c = new C
  println(c.msg)
}
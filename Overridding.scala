class Person {

  def speak(): Unit = {
    println("I am a person")
  }

  def listen(): Unit = {
    println("I am a person_2")
  }
}

class Student extends Person {

  override def speak(): Unit = {
    println("I am a student")
  }
}

object Main {
  def main(args: Array[String]): Unit = {

    val s = new Student()

    s.speak()
    s.listen()
  }
}

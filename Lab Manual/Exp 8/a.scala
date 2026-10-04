class Person8a(val name: String) {

  def displayRole(): Unit = {
    println("I am a person")
  }
}

class Teacher8a(name: String, val subject: String)
    extends Person8a(name) {

  override def displayRole(): Unit = {
    println("I am a teacher")
  }
}

object InheritanceDemo8a {

  def main(args: Array[String]): Unit = {

    val teacher = new Teacher8a("Ayush", "Artificial Intelligence")

    println("Name: " + teacher.name)
    println("Subject: " + teacher.subject)

    teacher.displayRole()
  }
}
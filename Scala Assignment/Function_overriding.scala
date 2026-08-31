class Teacher {
  def duty(): Unit = {
    println("Teacher's general duty: educating students")
  }

  def attendance(): Unit = {
    println("Marking attendance in register")
  }
}

class ClassTeacher extends Teacher {
  override def duty(): Unit = {
    println("Class Teacher's duty: managing entire class along with teaching")
  }
}

object Function_overriding {
  def main(args: Array[String]): Unit = {
    val t = new Teacher()
    t.duty()

    val ct = new ClassTeacher()
    ct.duty() // overridden version
    ct.attendance() // inherited, unchanged
  }
}
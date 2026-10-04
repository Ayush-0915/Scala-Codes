trait Printable8f {

  def print(): Unit = {
    println("This is a printable object.")
  }
}

case class Student8f(
  name: String,
  rollNo: Int
) extends Printable8f

object PrintableDemo8f {

  def main(args: Array[String]): Unit = {

    val student = Student8f("Ayush", 101)

    println("Name: " + student.name)
    println("Roll No: " + student.rollNo)

    student.print()
  }
}
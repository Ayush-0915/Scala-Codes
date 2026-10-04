class Student7(
  val name: String,
  val rollNo: Int,
  val marks: Double
) {

  def grade(): String = {
    if (marks >= 90)
      "A+"
    else if (marks >= 80)
      "A"
    else if (marks >= 70)
      "B"
    else if (marks >= 60)
      "C"
    else if (marks >= 50)
      "D"
    else
      "F"
  }
}

object StudentDemo7 {

  def main(args: Array[String]): Unit = {

    val student = new Student7("Ayush", 101, 85)

    println("Name: " + student.name)
    println("Roll No: " + student.rollNo)
    println("Marks: " + student.marks)
    println("Grade: " + student.grade())
  }
}
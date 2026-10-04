class Student7d(
  val name: String,
  val rollNo: Int,
  val marks: Double
) {

  def display(): Unit = {
    println("Name: " + name)
    println("Roll No: " + rollNo)
    println("Marks: " + marks)
  }
}

object Student7d {

  def apply(name: String, rollNo: Int, marks: Double): Student7d = {
    new Student7d(name, rollNo, marks)
  }

  def createStudent(
      name: String,
      rollNo: Int,
      marks: Double
  ): Student7d = {
    new Student7d(name, rollNo, marks)
  }
}

object StudentDemo7d {

  def main(args: Array[String]): Unit = {

    // Creating object using apply()
    val student1 = Student7d("Ayush", 101, 85)

    // Creating object using factory method
    val student2 = Student7d.createStudent("Rahul", 102, 90)

    println("Student 1:")
    student1.display()

    println("\nStudent 2:")
    student2.display()
  }
}

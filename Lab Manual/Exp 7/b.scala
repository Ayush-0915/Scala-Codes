class Student7b(
  val name: String,
  val rollNo: Int,
  val marks: Double
) {

  // Auxiliary constructor
  def this(name: String, rollNo: Int) = {
    this(name, rollNo, 0.0)
  }

  // Method to display student details
  def display(): Unit = {
    println("Name: " + name)
    println("Roll No: " + rollNo)
    println("Marks: " + marks)
  }
}

object StudentDemo7b {

  def main(args: Array[String]): Unit = {

    // Using primary constructor
    val student1 = new Student7b("Ayush", 101, 85)

    // Using auxiliary constructor
    val student2 = new Student7b("Rahul", 102)

    println("Student 1:")
    student1.display()

    println("\nStudent 2:")
    student2.display()
  }
}
class StudentExp6(val name: String, val age: Int) {

  def display(): Unit = {
    println("Name: " + name)
    println("Age: " + age)
  }
}

object StudentDemo {

  def main(args: Array[String]): Unit = {

    // Creating objects using the constructor
    val student1 = new StudentExp6("Ayush", 21)
    val student2 = new StudentExp6("Rahul", 20)

    println("Student 1:")
    student1.display()

    println("\nStudent 2:")
    student2.display()
  }
}
object TupleAndZip {

  def main(args: Array[String]): Unit = {

    // Creating a tuple
    val student = ("Ayush", 85)

    // Accessing tuple elements
    println("Student Name: " + student._1)
    println("Student Marks: " + student._2)

    // Creating two lists
    val names = List("Ayush", "Rahul", "Priya")
    val marks = List(85, 78, 92)

    // Combining lists using zip
    val studentData = names.zip(marks)

    println("Zipped List: " + studentData)
  }
}
object MapOperations {

  def main(args: Array[String]): Unit = {

    // Create a Map
    var students = Map(
      "Ayush" -> 85,
      "Rahul" -> 78,
      "Priya" -> 92
    )

    println("Original Map: " + students)

    // Add an entry
    students = students + ("Aman" -> 88)
    println("After adding Aman: " + students)

    // Update an entry
    students = students + ("Rahul" -> 82)
    println("After updating Rahul: " + students)

    // Remove an entry
    students = students - "Priya"
    println("After removing Priya: " + students)

    // Look up an entry
    println("Marks of Ayush: " + students("Ayush"))

    // Iterate over the Map
    println("Student Marks:")
    for ((name, marks) <- students) {
      println(name + " -> " + marks)
    }
  }
}
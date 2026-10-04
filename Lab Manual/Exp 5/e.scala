object SafeMapAccess {

  def main(args: Array[String]): Unit = {

    val students = Map(
      "Ayush" -> 85,
      "Rahul" -> 78,
      "Priya" -> 92
    )

    // Using contains
    println("Does Ayush exist? " + students.contains("Ayush"))
    println("Does Aman exist? " + students.contains("Aman"))

    // Using getOrElse
    println("Marks of Ayush: " +
      students.getOrElse("Ayush", 0))

    println("Marks of Aman: " +
      students.getOrElse("Aman", 0))
  }
}
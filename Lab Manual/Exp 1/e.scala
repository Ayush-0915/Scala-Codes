object StringInterpolationDemo {
  def main(args: Array[String]): Unit = {

    val name = "Ayush"
    val marks = 85
    val percentage = 85.5678

    // Using s"" interpolation
    println(s"Student Name: $name")
    println(s"Marks obtained: $marks")
    println(s"$name scored $marks marks.")

    // Using f"" interpolation
    println(f"Percentage: $percentage%.2f")
  }
}
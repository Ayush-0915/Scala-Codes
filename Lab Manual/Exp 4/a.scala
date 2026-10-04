object StringOperations {

  def main(args: Array[String]): Unit = {

    val text = "Scala Programming"

    // Find length
    println("Length: " + text.length)

    // Convert to uppercase
    println("Uppercase: " + text.toUpperCase)

    // Convert to lowercase
    println("Lowercase: " + text.toLowerCase)

    // Extract substring
    println("Substring: " + text.substring(0, 5))
  }
}
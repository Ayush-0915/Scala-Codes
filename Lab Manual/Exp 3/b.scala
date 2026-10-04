object DefaultAndVariableArguments {

  // Function with default parameter value
  def greet(name: String = "Student"): Unit = {
    println("Hello, " + name)
  }

  // Function with variable arguments
  def sum(numbers: Int*): Int = {
    numbers.sum
  }

  def main(args: Array[String]): Unit = {

    // Using default value
    greet()

    // Providing a value
    greet("Ayush")

    // Variable arguments
    println("Sum of 1, 2 and 3: " + sum(1, 2, 3))
    println("Sum of 10, 20, 30 and 40: " + sum(10, 20, 30, 40))
  }
}
object FunctionDemo {

  // Function with parameters and return type
  def add(a: Int, b: Int): Int = {
    a + b
  }

  def main(args: Array[String]): Unit = {

    // Positional arguments
    val result1 = add(10, 20)
    println("Using positional arguments: " + result1)

    // Named arguments
    val result2 = add(a = 30, b = 40)
    println("Using named arguments: " + result2)

    // Named arguments in different order
    val result3 = add(b = 50, a = 25)
    println("Using named arguments in different order: " + result3)
  }
}
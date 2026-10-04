object RecursiveFunctions {

  // Recursive function to calculate factorial
  def factorial(n: Int): Int = {
    if (n == 0)
      1
    else
      n * factorial(n - 1)
  }

  // Recursive function to calculate nth Fibonacci number
  def fibonacci(n: Int): Int = {
    if (n == 0)
      0
    else if (n == 1)
      1
    else
      fibonacci(n - 1) + fibonacci(n - 2)
  }

  def main(args: Array[String]): Unit = {

    val number = 5

    println("Factorial of " + number + ": " + factorial(number))

    println("Fibonacci series:")
    for (i <- 0 to 9) {
      print(fibonacci(i) + " ")
    }

    println()
    println("10th Fibonacci number: " + fibonacci(9))
  }
}
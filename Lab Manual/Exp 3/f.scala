object HigherOrderFunction {

  // Higher-order function
  def applyTwice(f: Int => Int, x: Int): Int = {
    f(f(x))
  }

  def main(args: Array[String]): Unit = {

    // Function to double a number
    val double = (x: Int) => x * 2

    // Passing the function as an argument
    val result = applyTwice(double, 5)

    println("Result: " + result)
  }
}
import scala.io.StdIn

object MenuCalculator {
  def main(args: Array[String]): Unit = {

    print("Enter first number: ")
    val num1 = StdIn.readLine().toDouble

    print("Enter second number: ")
    val num2 = StdIn.readLine().toDouble

    println("\nMenu")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")

    print("Enter your choice: ")
    val choice = StdIn.readLine().toInt

    choice match {
      case 1 =>
        println("Result: " + (num1 + num2))

      case 2 =>
        println("Result: " + (num1 - num2))

      case 3 =>
        println("Result: " + (num1 * num2))

      case 4 =>
        if (num2 != 0)
          println("Result: " + (num1 / num2))
        else
          println("Cannot divide by zero")

      case _ =>
        println("Invalid choice")
    }
  }
}
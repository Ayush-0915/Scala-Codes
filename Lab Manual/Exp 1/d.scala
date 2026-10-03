import scala.io.StdIn

object OperationsDemo {
  def main(args: Array[String]): Unit = {

    // Read two numbers from the user
    print("Enter first number: ")
    val num1 = StdIn.readLine().toInt

    print("Enter second number: ")
    val num2 = StdIn.readLine().toInt

    // Arithmetic operations
    println("Addition: " + (num1 + num2))
    println("Subtraction: " + (num1 - num2))
    println("Multiplication: " + (num1 * num2))
    println("Division: " + (num1 / num2))
    println("Modulus: " + (num1 % num2))

    // Relational operations
    println("num1 > num2: " + (num1 > num2))
    println("num1 < num2: " + (num1 < num2))
    println("num1 == num2: " + (num1 == num2))
    println("num1 != num2: " + (num1 != num2))

    // Logical operations
    println("(num1 > 0) && (num2 > 0): " + ((num1 > 0) && (num2 > 0)))
    println("(num1 > 0) || (num2 > 0): " + ((num1 > 0) || (num2 > 0)))
    println("!(num1 > 0): " + (!(num1 > 0)))
  }
}
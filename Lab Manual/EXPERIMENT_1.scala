import scala.io.StdIn

object Experiment1 {

  def main(args: Array[String]): Unit = {

    // (a) Hello World
    println("Hello, World!")

    // (b) val and var
    val name = "Ayush"
    var age = 20

    println(s"Name: $name")
    println(s"Age: $age")

    age = 21
    println(s"Updated Age: $age")

    // val cannot be reassigned
    // name = "Rahul"   // Error: reassignment to val

    // (c) Different data types
    val intValue: Int = 100
    val longValue: Long = 100000L
    val doubleValue: Double = 25.75
    val floatValue: Float = 12.5f
    val charValue: Char = 'A'
    val stringValue: String = "Scala"
    val booleanValue: Boolean = true

    println(s"Int: $intValue")
    println(s"Long: $longValue")
    println(s"Double: $doubleValue")
    println(s"Float: $floatValue")
    println(s"Char: $charValue")
    println(s"String: $stringValue")
    println(s"Boolean: $booleanValue")

    // (d) Taking two numbers as input
    print("Enter first number: ")
    val num1 = StdIn.readLine().toInt

    print("Enter second number: ")
    val num2 = StdIn.readLine().toInt

    // Arithmetic operations
    println(s"Addition: ${num1 + num2}")
    println(s"Subtraction: ${num1 - num2}")
    println(s"Multiplication: ${num1 * num2}")
    println(s"Division: ${num1 / num2}")

    // Relational operations
    println(s"num1 > num2: ${num1 > num2}")
    println(s"num1 < num2: ${num1 < num2}")
    println(s"num1 == num2: ${num1 == num2}")

    // Logical operations
    println(s"(num1 > 0) && (num2 > 0): ${(num1 > 0) && (num2 > 0)}")
    println(s"(num1 > 0) || (num2 > 0): ${(num1 > 0) || (num2 > 0)}")

    // (e) String interpolation
    val sum = num1 + num2
    println(s"The sum of $num1 and $num2 is $sum")

    val average = (num1 + num2) / 2.0
    println(f"Average = $average%.2f")

    // (f) Type inference and type conversion
    val inferredNumber = 50       // Scala infers Int
    val decimalNumber = 25.75     // Scala infers Double

    val convertedInt = decimalNumber.toInt
    val convertedDouble = inferredNumber.toDouble
    val convertedString = inferredNumber.toString

    println(s"Inferred Int: $inferredNumber")
    println(s"Inferred Double: $decimalNumber")
    println(s"Double to Int: $convertedInt")
    println(s"Int to Double: $convertedDouble")
    println(s"Int to String: $convertedString")
  }
}
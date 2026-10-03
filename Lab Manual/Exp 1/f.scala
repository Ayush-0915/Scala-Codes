object TypeConversionDemo {
  def main(args: Array[String]): Unit = {

    // Type inference
    val number = 100
    val decimal = 25.75
    val text = "Scala"

    println("Inferred Integer: " + number)
    println("Inferred Double: " + decimal)
    println("Inferred String: " + text)

    // Explicit type conversion
    val doubleValue = 45.67
    val intValue = doubleValue.toInt

    val integerValue = 50
    val doubleValue2 = integerValue.toDouble

    val stringValue = integerValue.toString

    println("Double to Int: " + intValue)
    println("Int to Double: " + doubleValue2)
    println("Int to String: " + stringValue)
  }
}
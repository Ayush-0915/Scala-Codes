object ArrayOperations {

  def main(args: Array[String]): Unit = {

    val numbers = Array(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)

    val sum = numbers.sum
    val maximum = numbers.max
    val minimum = numbers.min
    val average = sum.toDouble / numbers.length

    println("Array elements: " + numbers.mkString(", "))
    println("Sum: " + sum)
    println("Maximum: " + maximum)
    println("Minimum: " + minimum)
    println("Average: " + average)
  }
}
import scala.collection.mutable.ListBuffer

object ListBufferOperations {

  def main(args: Array[String]): Unit = {

    // Create a ListBuffer
    val numbers = ListBuffer(10, 20, 30)

    println("Original ListBuffer: " + numbers)

    // Add an element
    numbers += 40
    println("After adding 40: " + numbers)

    // Update an element
    numbers(1) = 25
    println("After updating index 1: " + numbers)

    // Remove an element
    numbers -= 30
    println("After removing 30: " + numbers)
  }
}
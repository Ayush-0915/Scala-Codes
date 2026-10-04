object ReverseSortArray {

  def main(args: Array[String]): Unit = {

    val numbers = Array(50, 20, 40, 10, 30)

    // Reverse without modifying original
    val reversedArray = numbers.reverse

    // Sort without modifying original
    val sortedArray = numbers.sorted

    // Access element by index
    val element = numbers(2)

    println("Original Array: " + numbers.mkString(", "))
    println("Reversed Array: " + reversedArray.mkString(", "))
    println("Sorted Array: " + sortedArray.mkString(", "))
    println("Element at index 2: " + element)
  }
}
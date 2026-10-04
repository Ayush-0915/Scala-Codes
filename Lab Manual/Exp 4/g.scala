object LinearSearch {

  def main(args: Array[String]): Unit = {

    val numbers = Array(10, 20, 30, 40, 50)
    val searchElement = 30

    var found = false

    for (i <- 0 until numbers.length) {
      if (numbers(i) == searchElement) {
        println("Element found at index: " + i)
        found = true
      }
    }

    if (!found) {
      println("Element not found")
    }
  }
}
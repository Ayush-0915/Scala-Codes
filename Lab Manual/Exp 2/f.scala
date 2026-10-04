object FibonacciSeries {
  def main(args: Array[String]): Unit = {

    val n = 10

    var first = 0
    var second = 1

    println("Fibonacci Series:")

    for (i <- 1 to n) {
      print(first + " ")

      val next = first + second
      first = second
      second = next
    }
  }
}
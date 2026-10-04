object AnonymousFunction {

  def main(args: Array[String]): Unit = {

    // Anonymous function stored in a val
    val square = (x: Int) => x * x

    // Calling the anonymous function
    val result = square(5)

    println("Square of 5: " + result)
  }
}
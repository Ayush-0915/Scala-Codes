object CurryingAndLocalFunction {

  // Curried function
  def add(a: Int)(b: Int): Int = {
    a + b
  }

  def main(args: Array[String]): Unit = {

    // Calling curried function
    val result = add(10)(20)

    println("Sum using currying: " + result)

    // Nested (local) function
    def square(x: Int): Int = {
      x * x
    }

    val number = 5
    println("Square using local function: " + square(number))
  }
}
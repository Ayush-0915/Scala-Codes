object FactorialDemo {
  def main(args: Array[String]): Unit = {

    val number = 5

    // Factorial using while loop
    var i = 1
    var factorialWhile = 1

    while (i <= number) {
      factorialWhile = factorialWhile * i
      i += 1
    }

    println("Factorial using while loop: " + factorialWhile)

    // Factorial using a while loop
    var j = 1
    var factorialDoWhile = 1

    while (j <= number) do {
      factorialDoWhile = factorialDoWhile * j
      j += 1
    }

    println("Factorial using do-while loop: " + factorialDoWhile)
  }
}
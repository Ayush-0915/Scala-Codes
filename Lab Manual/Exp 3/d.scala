import scala.annotation.tailrec

object TailRecursiveFactorial {

  // Normal recursive factorial
  def normalFactorial(n: Int): Int = {
    if (n == 0)
      1
    else
      n * normalFactorial(n - 1)
  }

  // Tail-recursive factorial
  @tailrec
  def tailFactorial(n: Int, accumulator: Int = 1): Int = {
    if (n == 0)
      accumulator
    else
      tailFactorial(n - 1, accumulator * n)
  }

  def main(args: Array[String]): Unit = {

    val number = 5

    println("Normal Recursive Factorial: " +
      normalFactorial(number))

    println("Tail Recursive Factorial: " +
      tailFactorial(number))
  }
}
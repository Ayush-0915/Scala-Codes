object MathUtils7f {

  // Find maximum of two numbers
  def max(a: Int, b: Int): Int = {
    if (a > b) a else b
  }

  // Find minimum of two numbers
  def min(a: Int, b: Int): Int = {
    if (a < b) a else b
  }

  // Check whether a number is prime
  def isPrime(n: Int): Boolean = {

    if (n < 2) {
      false
    } else {
      for (i <- 2 until n) {
        if (n % i == 0)
          return false
      }
      true
    }
  }
}

object UtilityDemo7f {

  def main(args: Array[String]): Unit = {

    println("Maximum: " + MathUtils7f.max(20, 35))

    println("Minimum: " + MathUtils7f.min(20, 35))

    println("Is 17 prime? " + MathUtils7f.isPrime(17))

    println("Is 20 prime? " + MathUtils7f.isPrime(20))
  }
}
object Loops_Control_Statement {
  def main(args: Array[String]): Unit = {
    // While loop
    println("Countdown using while loop:")
    var count = 5
    while (count >= 1) {
      println("Count: " + count)
      count -= 1
    }

    // For loop
    println("\nTable of 3 using for loop:")
    for (num <- 1 to 10) {
      println("3 x " + num + " = " + (3 * num))
    }

    // Control statement
    println("\nChecking numbers using if-else:")
    for (value <- 1 to 10) {
      if (value % 5 == 0) {
        println(value + " is divisible by 5")
      } else {
        println(value + " is not divisible by 5")
      }
    }

    // For loop with condition filter
    println("\nPrime-like filter example:")
    for (x <- 1 to 25 if x % 7 == 0) {
      println("Multiple of 7 found: " + x)
    }
  }
}
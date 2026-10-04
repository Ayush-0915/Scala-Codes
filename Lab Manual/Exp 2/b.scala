object LargestOfThree {
  def main(args: Array[String]): Unit = {

    val a = 25
    val b = 40
    val c = 15

    if (a >= b && a >= c) {
      println("Largest number is: " + a)
    }
    else if (b >= a && b >= c) {
      println("Largest number is: " + b)
    }
    else {
      println("Largest number is: " + c)
    }
  }
}
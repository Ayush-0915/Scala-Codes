object MultiplicationTable {
  def main(args: Array[String]): Unit = {

    val number = 5

    for (i <- 1 to 10) {
      println(number + " x " + i + " = " + (number * i))
    }
  }
}
object ForLoopDemo {
  def main(args: Array[String]): Unit = {

    // Using to
    println("Using to:")
    for (i <- 1 to 20) {
      print(i + " ")
    }

    // Using until
    println("\n\nUsing until:")
    for (i <- 1 until 20) {
      print(i + " ")
    }

    // Using by
    println("\n\nUsing by:")
    for (i <- 1 to 20 by 2) {
      print(i + " ")
    }

    // Using filter guard
    println("\n\nUsing filter guard:")
    for (i <- 1 to 20 if i % 2 == 0) {
      print(i + " ")
    }
  }
}
object ListOperations {

  def main(args: Array[String]): Unit = {

    // Creating an immutable List
    val numbers = List(10, 20, 30, 40, 50)

    println("Head: " + numbers.head)

    println("Tail: " + numbers.tail)

    println("Take first 3: " + numbers.take(3))

    println("Drop first 2: " + numbers.drop(2))

    println("Reversed: " + numbers.reverse)

    println("Using :+ : " + (numbers :+ 60))

    println("Using +: : " + (5 +: numbers))

    val list2 = List(60, 70)
    println("Using ::: : " + (numbers ::: list2))
  }
}
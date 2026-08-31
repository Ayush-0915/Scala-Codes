object try_catch extends App {
  val result: Int =
    try {
      10 / 0
    } catch {
      case _: ArithmeticException => -1
    } finally {
      println("cleanup runs regardless")
    }

  println(s"Result: $result")
}


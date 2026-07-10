def greet(name: String): Unit =
  println(s"Hello, $name from Scala 3!")

@main def run(): Unit =
  greet("Ayush")
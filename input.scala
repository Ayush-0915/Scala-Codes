import scala.io.StdIn

object input {
  def main(args: Array[String]): Unit = {

    println("Enter your name: ")
    val name = StdIn.readLine()

    println("Enter your Age: ")
    val age = StdIn.readInt()

    println(s"Hello, $name!")
    println(s"Age: $age!")

  }
}
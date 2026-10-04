import java.time.LocalDateTime

// Trait
trait Timestamped8e {
  val createdAt: LocalDateTime = LocalDateTime.now()
}

// Class using the trait
class Document8e(val name: String) extends Timestamped8e {

  def display(): Unit = {
    println("Document Name: " + name)
    println("Created At: " + createdAt)
  }
}

object TimestampDemo8e {

  def main(args: Array[String]): Unit = {

    val document = new Document8e("Scala Lab")

    document.display()
  }
}
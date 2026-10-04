import scala.collection.mutable.ListBuffer

object MutableImmutable {

  def main(args: Array[String]): Unit = {

    // Immutable collection
    val immutableList = List(10, 20, 30)

    // A new List is created when an element is added
    val newImmutableList = immutableList :+ 40

    println("Immutable List: " + immutableList)
    println("New Immutable List: " + newImmutableList)

    // Mutable collection
    val mutableList = ListBuffer(10, 20, 30)

    // Original ListBuffer is modified
    mutableList += 40

    println("Mutable ListBuffer: " + mutableList)
  }
}
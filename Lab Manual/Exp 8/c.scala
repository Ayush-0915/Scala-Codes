// Abstract class
abstract class Shape8c {
  def area(): Double
}

// Circle
class Circle8c(val radius: Double) extends Shape8c {

  override def area(): Double = {
    Math.PI * radius * radius
  }
}

// Rectangle
class Rectangle8c(
  val length: Double,
  val width: Double
) extends Shape8c {

  override def area(): Double = {
    length * width
  }
}

// Triangle
class Triangle8c(
  val base: Double,
  val height: Double
) extends Shape8c {

  override def area(): Double = {
    0.5 * base * height
  }
}

object PolymorphismDemo8c {

  def main(args: Array[String]): Unit = {

    // List containing different Shape objects
    val shapes: List[Shape8c] = List(
      new Circle8c(5),
      new Rectangle8c(10, 5),
      new Triangle8c(8, 4)
    )

    // Runtime polymorphism
    for (shape <- shapes) {
      println("Area: " + shape.area())
    }
  }
}
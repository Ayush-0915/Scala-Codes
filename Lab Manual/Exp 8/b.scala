// Abstract class
abstract class Shape8b {

  def area(): Double
  def perimeter(): Double
}

// Circle
class Circle8b(val radius: Double) extends Shape8b {

  override def area(): Double = {
    Math.PI * radius * radius
  }

  override def perimeter(): Double = {
    2 * Math.PI * radius
  }
}

// Rectangle
class Rectangle8b(
  val length: Double,
  val width: Double
) extends Shape8b {

  override def area(): Double = {
    length * width
  }

  override def perimeter(): Double = {
    2 * (length + width)
  }
}

// Triangle
class Triangle8b(
  val a: Double,
  val b: Double,
  val c: Double
) extends Shape8b {

  override def perimeter(): Double = {
    a + b + c
  }

  override def area(): Double = {
    val s = perimeter() / 2
    Math.sqrt(s * (s - a) * (s - b) * (s - c))
  }
}

object ShapeDemo8b {

  def main(args: Array[String]): Unit = {

    val circle = new Circle8b(5)
    val rectangle = new Rectangle8b(10, 5)
    val triangle = new Triangle8b(3, 4, 5)

    println("Circle Area: " + circle.area())
    println("Circle Perimeter: " + circle.perimeter())

    println("Rectangle Area: " + rectangle.area())
    println("Rectangle Perimeter: " + rectangle.perimeter())

    println("Triangle Area: " + triangle.area())
    println("Triangle Perimeter: " + triangle.perimeter())
  }
}
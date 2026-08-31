class Rectangle(val length: Double, val breadth: Double) {

  // Auxiliary constructor for square
  def this(side: Double) = {
    this(side, side)
  }

  def area(): Double = {
    length * breadth
  }
}

object Constructors extends App {

  // Using primary constructor
  val rectangle = new Rectangle(10, 5)

  // Using auxiliary constructor
  val square = new Rectangle(6)

  println(s"Rectangle Area: ${rectangle.area()}")
  println(s"Square Area: ${square.area()}")
}

/*
Sample Output:
Rectangle Area: 50.0
Square Area: 36.0
*/
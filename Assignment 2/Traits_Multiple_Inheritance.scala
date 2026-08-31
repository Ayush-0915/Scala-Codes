trait Printable {
  def printDetails(): Unit
}

trait Discountable {
  def applyDiscount(price: Double): Double
}

class Product(val name: String, val price: Double)
    extends Printable with Discountable {

  override def printDetails(): Unit = {
    println(s"Product Name: $name")
    println(s"Original Price: Rs.$price")
  }

  override def applyDiscount(price: Double): Double = {
    price * 0.90
  }
}

object Traits_Multiple_Inheritance extends App {

  val product = new Product("Laptop", 50000)

  product.printDetails()

  val discountedPrice = product.applyDiscount(product.price)

  println(s"Price after 10% discount: Rs.$discountedPrice")
}

/*
Sample Output:
Product Name: Laptop
Original Price: ₹50000.0
Price after 10% discount: ₹45000.0
*/
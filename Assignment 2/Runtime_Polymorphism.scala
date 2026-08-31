abstract class PaymentMethod {
  def pay(amount: Double): Unit
}

class CreditCard extends PaymentMethod {
  override def pay(amount: Double): Unit = {
    println(s"Paid Rs.$amount using Credit Card")
  }
}

class UPI extends PaymentMethod {
  override def pay(amount: Double): Unit = {
    println(s"Paid Rs.$amount using UPI")
  }
}

class Cash extends PaymentMethod {
  override def pay(amount: Double): Unit = {
    println(s"Paid Rs.$amount using Cash")
  }
}

object Runtime_Polymorphism extends App {

  def processPayment(method: PaymentMethod, amount: Double): Unit = {
    method.pay(amount)
  }

  processPayment(new CreditCard, 1500)
  processPayment(new UPI, 750)
  processPayment(new Cash, 500)
}

/*
Sample Output:
Paid ₹1500.0 using Credit Card
Paid ₹750.0 using UPI
Paid ₹500.0 using Cash
*/
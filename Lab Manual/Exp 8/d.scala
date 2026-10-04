// Trait
trait Logger8d {

  def log(msg: String): Unit = {
    println("LOG: " + msg)
  }
}

// First class mixing in Logger
class UserService8d extends Logger8d {

  def createUser(): Unit = {
    log("User created successfully")
  }
}

// Second class mixing in Logger
class PaymentService8d extends Logger8d {

  def makePayment(): Unit = {
    log("Payment completed successfully")
  }
}

object LoggerDemo8d {

  def main(args: Array[String]): Unit = {

    val userService = new UserService8d()
    val paymentService = new PaymentService8d()

    userService.createUser()
    paymentService.makePayment()
  }
}
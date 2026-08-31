class BankAccount {

  private var balance: Double = 0.0

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited: $amount")
    } else {
      println("Invalid deposit amount")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount <= 0) {
      println("Invalid withdrawal amount")
    } else if (amount > balance) {
      println("Insufficient funds!")
    } else {
      balance -= amount
      println(s"Withdrawn: $amount")
    }
  }

  def getBalance(): Double = {
    balance
  }
}

object Encapsulation extends App {

  val account = new BankAccount

  account.deposit(10000)
  account.withdraw(3000)
  account.withdraw(9000)

  println(s"Current Balance: ${account.getBalance()}")
}

/*
Sample Output:
Deposited: 10000.0
Withdrawn: 3000.0
Insufficient funds!
Current Balance: 7000.0
*/
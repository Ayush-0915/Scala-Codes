class BankAccount {
  private var balance: Double = 0.0

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
    } else {
      println("Deposit amount must be positive.")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
    } else {
      println("Invalid withdrawal amount.")
    }
  }

  def getBalance: Double = balance
}

object Encapsulation {
  def main(args: Array[String]): Unit = {
    val acc = new BankAccount()

    acc.deposit(5000)
    acc.withdraw(1500)

    println(s"Balance: ${acc.getBalance}")
  }
}

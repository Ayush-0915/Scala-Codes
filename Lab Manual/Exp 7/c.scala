class BankAccount7c(private var balance: Double) {

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println("Deposited: " + amount)
    } else {
      println("Invalid deposit amount")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println("Withdrawn: " + amount)
    } else {
      println("Invalid withdrawal")
    }
  }

  def getBalance(): Double = {
    balance
  }
}

object BankAccountDemo7c {

  def main(args: Array[String]): Unit = {

    val account = new BankAccount7c(10000)

    println("Initial Balance: " + account.getBalance())

    account.deposit(5000)
    println("Balance: " + account.getBalance())

    account.withdraw(3000)
    println("Balance: " + account.getBalance())

    // Invalid withdrawal
    account.withdraw(20000)

    println("Final Balance: " + account.getBalance())
  }
}
// Encapsulation
class Employee(private var salary: Double) {
  def viewSalary(): Double = salary

  def giveBonus(amount: Double): Unit = {
    if (amount > 0) salary += amount
  }
}

// Polymorphism via method overriding
class Instrument {
  def play(): String = "Playing an instrument"
}

class Guitar extends Instrument {
  override def play(): String = "Strumming the guitar"
}

class Piano extends Instrument {
  override def play(): String = "Playing piano keys"
}

object Polymorphism_Encapsulation {
  def main(args: Array[String]): Unit = {
    val emp = new Employee(25000.0)
    emp.giveBonus(3000)
    println("Employee salary: " + emp.viewSalary())

    val instruments: Array[Instrument] = Array(new Guitar(), new Piano())
    for (item <- instruments) {
      println(item.play())
    }
  }
}
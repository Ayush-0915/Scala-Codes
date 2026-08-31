abstract class Employee(val name: String) {

  def calculateSalary(): Double
}

trait Bonus {

  def bonusAmount(): Double = {
    10000.0
  }
}

class Manager(name: String, val basicSalary: Double)
    extends Employee(name) with Bonus {

  override def calculateSalary(): Double = {
    basicSalary + bonusAmount()
  }
}

object Abstract_Class_vs_Trait extends App {

  val manager = new Manager("Rahul", 60000)

  println(s"Manager Name: ${manager.name}")
  println(s"Total Salary: Rs.${manager.calculateSalary()}")
}

/*
Sample Output:
Manager Name: Rahul
Total Salary: ₹70000.0
*/
case class Employee7e(
  name: String,
  dept: String,
  salary: Double
)

object EmployeeDemo7e {

  def main(args: Array[String]): Unit = {

    // Creating objects without new
    val emp1 = Employee7e("Ayush", "AI/ML", 50000)
    val emp2 = Employee7e("Rahul", "IT", 45000)

    // toString
    println("Employee 1: " + emp1.toString)

    // copy()
    val emp3 = emp1.copy(salary = 60000)
    println("Copied Employee: " + emp3)

    // Equality
    println("Are emp1 and emp2 equal? " + (emp1 == emp2))
    println("Are emp1 and emp3 equal? " + (emp1 == emp3))
  }
}
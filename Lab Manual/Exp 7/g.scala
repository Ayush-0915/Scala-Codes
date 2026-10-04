case class Employee7g(
  name: String,
  dept: String,
  salary: Double
)

object HighestSalary7g {

  def main(args: Array[String]): Unit = {

    val employees = List(
      Employee7g("Ayush", "AI/ML", 50000),
      Employee7g("Rahul", "IT", 45000),
      Employee7g("Priya", "Data Science", 65000),
      Employee7g("Aman", "Software", 55000)
    )

    // Find employee with highest salary
    val highestPaid = employees.maxBy(_.salary)

    println("Employees:")
    employees.foreach(println)

    println("\nEmployee with highest salary:")
    println("Name: " + highestPaid.name)
    println("Department: " + highestPaid.dept)
    println("Salary: " + highestPaid.salary)
  }
}

trait Greeter {
  def name: String                    // Abstract member
  def greet(): String = s"Hello, $name" // Concrete/default method
}

class Employee(val name: String) extends Greeter

object traits extends App {
  val employee = new Employee("Ayush")
  println(employee.name)
  println(employee.greet())
}
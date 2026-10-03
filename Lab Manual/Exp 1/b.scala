object VariablesDemo {
  def main(args: Array[String]): Unit = {
    // val is immutable
    val name = "Ayush"
    // var is mutable
    var age = 20
    println("Name: " + name)
    println("Age: " + age)
    // Reassigning var is allowed
    age = 21
    println("Updated Age: " + age)
  }
}
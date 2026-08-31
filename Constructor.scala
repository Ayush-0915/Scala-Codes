class StudentInfo(name: String, age: Int) {

  def display(): Unit = {
    println("Name: " + name)
    println("Age: " + age)
  }
}

object Constructor extends App {
  val s1 = new StudentInfo("Rahul", 23)
  s1.display()
}

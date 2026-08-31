class Student(val name: String, val rollNo: Int, val marks: Array[Int]) {

  def percentage(): Double = {
    marks.sum.toDouble / marks.length
  }
}

object Class_Object_Basics extends App {

  val s1 = new Student("Rahul", 101, Array(80, 75, 90, 85, 70))
  val s2 = new Student("Priya", 102, Array(88, 92, 85, 90, 95))
  val s3 = new Student("Aman", 103, Array(70, 65, 75, 80, 72))

  println(s"${s1.name}: ${s1.percentage()}%")
  println(s"${s2.name}: ${s2.percentage()}%")
  println(s"${s3.name}: ${s3.percentage()}%")
}

/*
Sample Output:
Rahul: 80.0%
Priya: 90.0%
Aman: 72.4%
*/
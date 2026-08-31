object block_expression {
  def main(args: Array[String]): Unit = {
    val finalMarks = {
      val theory = 45
      val practical = 38
      val total = theory + practical
      total + 5 // bonus marks added, last expr returned
    }
    println("Final marks after block evaluation: " + finalMarks)

    val greetingText = {
      val subject = "Scala Programming"
      "Welcome to " + subject + " lab session"
    }
    println(greetingText)
  }
}
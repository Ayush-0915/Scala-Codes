object GroupByDemo6 {

  def main(args: Array[String]): Unit = {

    val words = List(
      "scala",
      "java",
      "python",
      "ai",
      "ml",
      "code",
      "data"
    )

    // Group words according to their length
    val groupedWords = words.groupBy(word => word.length)

    println("Words grouped by length:")

    for ((length, group) <- groupedWords) {
      println(length + " -> " + group)
    }

    // Count words in each group
    println("\nCount of words in each group:")

    for ((length, group) <- groupedWords) {
      println("Length " + length + ": " + group.size)
    }
  }
}
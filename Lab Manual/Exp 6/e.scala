object SortingAndTaking6 {

  def main(args: Array[String]): Unit = {

    val numbers = List(5, 12, 7, 20, 3, 18, 9, 14)

    // sortBy
    val sortedBy = numbers.sortBy(x => x)

    // sortWith - descending order
    val sortedWith = numbers.sortWith((a, b) => a > b)

    // take - first 3 elements
    val firstThree = numbers.take(3)

    // takeWhile - take elements while condition is true
    val takenWhile = numbers.takeWhile(x => x < 20)

    // dropWhile - drop elements while condition is true
    val droppedWhile = numbers.dropWhile(x => x < 20)

    println("Original List: " + numbers)
    println("sortBy: " + sortedBy)
    println("sortWith (descending): " + sortedWith)
    println("take(3): " + firstThree)
    println("takeWhile(x < 20): " + takenWhile)
    println("dropWhile(x < 20): " + droppedWhile)
  }
}
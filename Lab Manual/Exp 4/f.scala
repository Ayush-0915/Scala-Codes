object MatrixOperations {

  def main(args: Array[String]): Unit = {

    val matrix = Array(
      Array(1, 2, 3),
      Array(4, 5, 6),
      Array(7, 8, 9)
    )

    println("3 x 3 Matrix:")

    // Print matrix row by row
    for (row <- matrix) {
      println(row.mkString(" "))
    }

    // Find sum of diagonal elements
    var diagonalSum = 0

    for (i <- 0 until 3) {
      diagonalSum += matrix(i)(i)
    }

    println("Sum of diagonal elements: " + diagonalSum)
  }
}
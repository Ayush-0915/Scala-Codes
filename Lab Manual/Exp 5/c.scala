object SetOperations {

  def main(args: Array[String]): Unit = {

    // Creating two Sets
    val set1 = Set(1, 2, 3, 4, 4, 5)
    val set2 = Set(4, 5, 6, 7)

    // Set removes duplicate elements
    println("Set 1: " + set1)
    println("Set 2: " + set2)

    // Union
    println("Union: " + (set1 union set2))

    // Intersection
    println("Intersection: " + (set1 intersect set2))

    // Difference
    println("Difference: " + (set1 diff set2))
  }
}
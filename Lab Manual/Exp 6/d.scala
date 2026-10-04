object CollectionMethods6 {

  def main(args: Array[String]): Unit = {

    val numbers = List(5, 12, 7, 20, 3, 18, 9, 14)

    // exists: checks if at least one element satisfies the condition
    val hasEven = numbers.exists(x => x % 2 == 0)

    // forall: checks if all elements satisfy the condition
    val allPositive = numbers.forall(x => x > 0)

    // find: returns the first element satisfying the condition
    val firstEven = numbers.find(x => x % 2 == 0)

    // count: counts elements satisfying the condition
    val evenCount = numbers.count(x => x % 2 == 0)

    // partition: separates elements into two lists
    val (evenNumbers, oddNumbers) =
      numbers.partition(x => x % 2 == 0)

    println("Original List: " + numbers)
    println("Exists even number: " + hasEven)
    println("All numbers are positive: " + allPositive)
    println("First even number: " + firstEven)
    println("Number of even elements: " + evenCount)
    println("Even numbers: " + evenNumbers)
    println("Odd numbers: " + oddNumbers)
  }
}
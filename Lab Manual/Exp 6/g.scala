object ForComprehension6 {

  def main(args: Array[String]): Unit = {

    val pairs = for {
      i <- 1 to 4
      j <- 1 to 4
      if i < j
    } yield (i, j)

    println("Pairs where i < j:")
    println(pairs)
  }
}
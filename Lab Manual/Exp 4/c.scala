object VowelConsonantCount {

  def main(args: Array[String]): Unit = {

    val text = "Scala Programming"
    var vowels = 0
    var consonants = 0

    for (ch <- text.toLowerCase if ch.isLetter) {
      if ("aeiou".contains(ch)) {
        vowels += 1
      } else {
        consonants += 1
      }
    }

    println("String: " + text)
    println("Vowels: " + vowels)
    println("Consonants: " + consonants)
  }
}
object PalindromeCheck {

  def main(args: Array[String]): Unit = {

    val text = "madam"

    val reversedText = text.reverse

    if (text == reversedText) {
      println("The string is a palindrome")
    } else {
      println("The string is not a palindrome")
    }
  }
}
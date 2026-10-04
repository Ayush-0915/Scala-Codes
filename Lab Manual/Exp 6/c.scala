// Abstract class
abstract class Animal6 {
  def sound(): Unit
}

// Trait
trait Pet6 {
  def play(): Unit = {
    println("Pet is playing")
  }
}

// Class extends abstract class and mixes in trait
class Dog6 extends Animal6 with Pet6 {

  override def sound(): Unit = {
    println("Dog barks")
  }
}

object AbstractTraitDemo6 {

  def main(args: Array[String]): Unit = {

    val dog = new Dog6()

    dog.sound()
    dog.play()
  }
}
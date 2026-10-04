// Parent class
class AnimalExp6 {

  def sound(): Unit = {
    println("Animal makes a sound")
  }
}

// Child class
class DogExp6 extends AnimalExp6 {

  override def sound(): Unit = {
    println("Dog barks")
  }
}

object InheritanceDemo {

  def main(args: Array[String]): Unit = {

    val dog = new DogExp6()

    dog.sound()
  }
}
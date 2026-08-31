class Animal {
  def sound(): String = {
    "Some generic sound"
  }
}

class Dog extends Animal {
  override def sound(): String = {
    "Woof"
  }
}

class Cat extends Animal {
  override def sound(): String = {
    "Meow"
  }
}

class Cow extends Animal {
  override def sound(): String = {
    "Moo"
  }
}

object Inheritance extends App {

  val animals: List[Animal] = List(
    new Dog,
    new Cat,
    new Cow
  )

  for (animal <- animals) {
    println(animal.sound())
  }
}

/*
Sample Output:
Woof
Meow
Moo
*/
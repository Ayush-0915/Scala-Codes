class Vehicle {
  def start(): Unit = {
    println("Vehicle engine has started")
  }
}

class Bike extends Vehicle {
  def ringBell(): Unit = {
    println("Bike bell: Tring Tring")
  }
}

object single_level_inheritence {
  def main(args: Array[String]): Unit = {
    val myBike = new Bike()
    myBike.start()
    myBike.ringBell()
  }
}
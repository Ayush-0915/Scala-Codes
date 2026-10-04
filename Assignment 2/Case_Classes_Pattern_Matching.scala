sealed trait Vehicle

case class Car(model: String, seats: Int) extends Vehicle

case class Bike(model: String) extends Vehicle

case class Truck(model: String, capacityTons: Double) extends Vehicle

object Case_Classes_Pattern_Matching {

  def describeVehicle(v: Vehicle): String = {
    v match {
      case Car(model, seats) =>
        s"Car: $model with $seats seats"

      case Bike(model) =>
        s"Bike: $model"

      case Truck(model, capacityTons) =>
        s"Truck: $model with capacity of $capacityTons tons"
    }
  }

  def main(args: Array[String]): Unit = {
    val car = Car("Toyota", 5)
    val bike = Bike("Yamaha")
    val truck = Truck("Volvo", 10.5)

    println(describeVehicle(car))
    println(describeVehicle(bike))
    println(describeVehicle(truck))
  }
}

/*
Sample Output:
Car: Toyota with 5 seats
Bike: Yamaha
Truck: Volvo with capacity of 10.5 tons
*/
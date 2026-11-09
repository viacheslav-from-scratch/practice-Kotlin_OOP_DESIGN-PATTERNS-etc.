package test18

import test17.describe

fun main(){
    val car1 = Car("Toyota", 50000, 5)
    val truck1 = Truck("Volvo", 18.0)
    val truck2 = Truck()

    val drive = Drive("Licence For Varna Transport Company", 1)

    drive.register(car1)
    drive.register(truck1)
    drive.register(truck2)

    car1.drive(120)

//    for (i in 0 until drive.vehicles.size)
//        println(drive.vehicles.fo)
    drive.vehicles.forEach { vehicle -> println(vehicle.describe()) }
    drive.vehicles.filter { vehicle -> vehicle.equals(vehicle.mileage > 0) }

    val fueltype = FuelType.entries

    fueltype.forEach { fuelType -> println("${fuelType.name} ${fuelType.pricePerLiter} ${fuelType.isGreen()}") }

    val event1 = Event.Refuel(50)
    val event2 = Event.Repair(1000.0)
    val event3 = Event.Sold
   handle(event1)
    handle(event2)
    handle(event3)

    val ivan = Drive("Ivan", 7)
    println(ivan)
    val copyIvan = ivan.copy(licenseId = 8)
    println(copyIvan)

    println("is object are the same?: ${ivan == copyIvan}")
    println("is class are the same?: ${ivan === copyIvan}")

    val nickname: String? = null
    println(nickname?.length ?: 0)
}
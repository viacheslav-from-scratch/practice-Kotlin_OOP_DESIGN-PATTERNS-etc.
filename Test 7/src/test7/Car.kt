package test7

class Car constructor(brand: String, mileage: Int, seats: Int) : Vehicle(brand, mileage) {
    val seats: Int = 0

    override fun describe(): String{
        return "Car $brand, $seats seats"
    }
}
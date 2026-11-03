package test8

class Car constructor(
    brand: String,
    mileage: Int,
    val seats: Int
) : Vehicle(brand, mileage) {

    override fun describe(): String {
        return "Car $brand, $seats seats"
    }
}
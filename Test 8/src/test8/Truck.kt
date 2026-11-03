package test8

class Truck constructor(
    brand: String,
    val capacityTons: Double
) : Vehicle(brand, 0){

    constructor() : this("Unknown", 1.0)

    override fun describe(): String {
        return "Track $brand, $capacityTons t"
    }
}
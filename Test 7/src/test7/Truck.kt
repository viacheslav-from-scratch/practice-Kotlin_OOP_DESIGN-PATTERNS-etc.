package test7

class Truck constructor(brand: String, val capacityTons: Double) : Vehicle(brand, 0) {
    constructor() : this("Unknown", 0.0)

    override fun describe(): String {
        return "1"
    }
}
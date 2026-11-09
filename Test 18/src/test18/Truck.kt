package test18

class Truck(brand: String, capacityTons: Double) : Vehicle(brand, 0) {
    private var valueCapacityTons: Double = capacityTons

    constructor() : this("Unknown", 1.0)

    override fun describe(): String {
        return "Truck $brand, $valueCapacityTons t"
    }
}
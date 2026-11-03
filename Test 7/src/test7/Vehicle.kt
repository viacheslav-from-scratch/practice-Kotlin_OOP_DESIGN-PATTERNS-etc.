package test7

abstract class Vehicle constructor(val brand: String, var mileage: Int) {
    init {
        println("Created: $brand")
    }

    fun drive(km: Int): String {
        return "$brand drove $km, total $mileage"
    }

    open fun describe(): String {
        return "brand: $brand, mileage: $mileage"
    }
}
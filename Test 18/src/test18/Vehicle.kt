package test18

abstract class Vehicle constructor(val brand: String, var mileage: Int) {
    init {
        println("Created $brand")
    }
    fun drive(km: Int): Unit {
        mileage += km
        println("$brand drove $km km, total $mileage")
    }

    abstract fun describe(): String
}
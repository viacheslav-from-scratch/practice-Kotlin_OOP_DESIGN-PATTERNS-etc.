package test8

abstract class Vehicle constructor(
    val brand: String,
    var mileage: Int
) {

    init {
        println("Created $brand")
    }

    fun drive(km: Int): Unit {
        mileage = km + mileage
        println("$brand drove $km, total $mileage")
    }

    abstract fun describe(): String
}
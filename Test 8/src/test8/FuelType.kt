package test8

enum class FuelType(
    val pricePerLiter: Double
) {

    PETROL(2.6), DIESEL(2.5), ELECTRIC(0.4);

    fun isGreen(f: FuelType): Boolean {
        return when (f) {
            FuelType.ELECTRIC -> true
            else -> false
        }
    }
}

package test18

enum class FuelType constructor(val pricePerLiter: Double) {
    PETROL(2.6),
    DIESEL(2.5),
    ELECTRIC(0.4);

    fun isGreen(): Boolean{
        return this == FuelType.ELECTRIC
    }
}
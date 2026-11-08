package minitest10

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        (temperature > 30) -> true
        (dirty > 30) -> true
        (day == "Sunday") -> true
        else -> false
    }
}

fun main() = println("${shouldChangeWater("Monday")} ${shouldChangeWater("Monday", 35)} ${shouldChangeWater("Sunday")}")
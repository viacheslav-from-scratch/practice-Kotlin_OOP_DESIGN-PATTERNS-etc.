package minitest9

fun isSunday(day: String) = day == "Sunday"

fun isDirty(dirty: Int) = dirty > 30

fun isTooHot(temperature: Int) = temperature > 30

fun main() = println("${isTooHot(35)} ${isDirty(10)} ${isSunday("Sunday")}")
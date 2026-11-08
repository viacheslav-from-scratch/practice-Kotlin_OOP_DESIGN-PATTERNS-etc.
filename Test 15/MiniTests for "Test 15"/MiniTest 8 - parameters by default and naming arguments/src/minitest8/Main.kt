package minitest8

fun swim(speed: String = "fast", laps: Int = 1) = println("swimming $speed x$laps")

fun main() {
    swim()
    swim(laps = 3)
    swim("slow", laps = 2)
}
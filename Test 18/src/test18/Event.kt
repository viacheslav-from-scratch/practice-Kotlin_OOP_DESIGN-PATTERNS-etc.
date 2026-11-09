package test18

sealed class Event {
    class Refuel(val liters: Int) : Event()
    class Repair(val cost: Double) : Event()
    object Sold : Event()
}

fun handle(e: Event): String = when (e) {
    is Event.Refuel -> "Refiled"
    is Event.Repair -> "Repaired"
    Event.Sold -> "Soled"
}
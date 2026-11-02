package test5

class Device(val id: Int, var name: String) {
    init {
        println("Created device " + id)
    }
    constructor(name: String) : this(0, name)
    var isOn: Boolean = false
        private set
    fun turnOn() {
        isOn = true
    }
    fun turnOff() {
        isOn = false
    }
}
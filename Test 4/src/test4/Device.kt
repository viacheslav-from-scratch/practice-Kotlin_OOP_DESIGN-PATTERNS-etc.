package test4

class Device constructor(val id: Int, val name: String) {
    var isOn: Boolean = false   // isOn: can be READ from outside
        private set             // can be CHANGED only inside the class

    fun turnOff(){
        isOn = false
    }

    fun turnOn(){
        isOn = true
    }
}
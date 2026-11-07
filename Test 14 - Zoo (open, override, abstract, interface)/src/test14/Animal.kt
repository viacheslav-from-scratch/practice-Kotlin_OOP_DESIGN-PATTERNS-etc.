package test14

interface Animal {
    var name: String

    fun sound(): String

    fun introduce(): Unit {
        println("$name said ${sound()}")
    }
}
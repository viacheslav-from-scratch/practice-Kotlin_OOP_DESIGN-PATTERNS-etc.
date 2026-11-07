package test14

open class Dog() : Animal {
    override var name: String
        get() = "Veronika"
        set(value) {}

    override fun sound(): String {
        return "Woof"
    }
}
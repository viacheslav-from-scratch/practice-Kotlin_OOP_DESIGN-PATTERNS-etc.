package test14

class Penguin : Bird() {
    override var name: String
        get() = "Gabimaru"
        set(value) {}

    override fun sound(): String {
        return "knock-knock"
    }

    override fun canFly(): Boolean {
        return false;
    }
}
package test14

class Eagle : Bird() {
    override var name: String
        get() = "Boomerang"
        set(value) {}

    override fun sound(): String {
        return "eeeeeeeeeeaaaaaaaaaaa"
    }

    override fun canFly(): Boolean {
        return true;
    }
}
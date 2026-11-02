package test3

open class DefaultCard(id: Int, name: String, balance: Double) {
    private var idValue: Int = id
    private var nameValue: String = name
    private var balanceValue: Double = balance

    constructor() : this(0, "", 0.0)

    public fun getId(): Int {
        return idValue
    }

    public fun getName(): String {
        return nameValue
    }

    public fun getBalance(): Double {
        return balanceValue
    }

    public fun setId(id: Int) {
        idValue = id
    }

    public fun setName(name: String) {
        nameValue = name
    }

    public fun setBalance(balance: Double) {
        balanceValue = balance
    }
}
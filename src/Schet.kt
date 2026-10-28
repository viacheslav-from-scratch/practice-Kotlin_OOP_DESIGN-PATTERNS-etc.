class Schet(serialnumber: Int, name: String, balance: Double) {
    private var serialNumberValue: Int = serialnumber
    private var nameValue: String = name
    private var balanceValue: Double = balance

    constructor() : this(0, "", 0.0)

    fun getNumber(): Int {
        return serialNumberValue
    }

    fun setNumber(serialnumber: Int) {
        serialNumberValue = serialnumber
    }

    fun getName(): String {
        return nameValue
    }

    fun setName(name: String){
        nameValue = name
    }

    fun getBalance(): Double {
        return balanceValue
    }

    fun setBalance(balance: Double) {
        balanceValue = balance
    }
}
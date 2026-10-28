class Account(serialnumber: Int, name: String, balance: Double) {
    private var serialNumberValue: Int = serialnumber
    private var nameValue: String = name
    private var balanceValue: Double = balance
    private var overDraftValue: Double = -1000.0

    constructor() : this(0, "", 0.0)

    public fun getSerialNumber(): Int {
        return serialNumberValue
    }

    public fun setSerialNumber(serialnumber: Int){
        serialNumberValue = serialnumber
    }

    public fun getName(): String{
        return nameValue
    }

    public fun setName(name: String){
        nameValue = name
    }

    public fun getBalance(): Double {
        return balanceValue
    }

    public fun setBalance(balance: Double) {
        balanceValue = balance
    }

    public fun putMoney(balance: Double){
        if(balance != 0.0){
            balanceValue += balance
        }
        else{
            println("Error, you cannot put 0 Euro")
        }
    }

    public fun takeMoney(balance: Double){
        if(overDraftValue+balance >= balanceValue){
            println("Overdraft couldn't be: $overDraftValue")
        }
        else if(balance != 0.0){
            balanceValue -= balance
        }
        else{
            println("Error, you cannot take 0 Euro")
        }
    }

    public fun displayAll(){
        println(
            "person serial number: " + serialNumberValue + "\n" +
                    "person name: " + nameValue + "\n" +
                    "person balance: " + balanceValue + "\n" +
                    "person overdraft: " + overDraftValue
        )
    }
}
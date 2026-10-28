fun makeSchet(schet1: Schet, number: Int, name: String, balance: Float) {
    schet1.setNumber(number)
    schet1.setName(name)
    schet1.setBalance(balance)
}

fun main() {
    val schet1 = Schet()


    schet1.setNumber(1234567890)
    schet1.setName("Ivan Ivanov")
    schet1.setBalance(1302.07)

    println(
        "Serial Number: " + schet1.getNumber() + "\n" +
        "Name: " + schet1.getName() + "\n" +
        "Balance: " + schet1.getBalance() + "\n"
    )


}
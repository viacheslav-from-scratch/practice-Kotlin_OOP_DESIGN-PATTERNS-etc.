package test17

sealed class Payment {
    class Card(val number: String, val amount: Double) : Payment()
    class Cash(val amount: Double) : Payment()
    object Free : Payment()
}

fun describe(p: Payment): String {
    return when(p) {
        is Payment.Card -> "card"
        is Payment.Cash -> "cash"
        Payment.Free -> "free"
    }
}
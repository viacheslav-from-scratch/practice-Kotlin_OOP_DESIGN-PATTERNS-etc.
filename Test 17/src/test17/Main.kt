package test17

fun main(){
    val card = Payment.Card("0", 2133.03)
    val cash = Payment.Cash(193.23)
    val free = Payment.Free

    println(describe(card))
    println(describe(cash))
    println(describe(free))
}

package test9

enum class Coffee(var price: Double) {
    EXPRESSO(1.0),
    CAPPUCHINO(1.5),
    LATTE(1.8);

    fun addMilk(): Boolean {
        price += (price/100)*20
        return true;
    }

    fun finalPrice(): Unit {
        if (addMilk()){

        }
    }
}

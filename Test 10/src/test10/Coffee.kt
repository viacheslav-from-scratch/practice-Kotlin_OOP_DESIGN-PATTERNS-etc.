package test10

enum class Coffee constructor(
    var price: Double
) {
    ESPRESSO(1.0),
    CAPPUCCINO(1.5),
    LATTE(1.8);

    fun describe(): String {
        return when (this) {
            Coffee.ESPRESSO -> "Крепкий"
            Coffee.CAPPUCCINO -> "Пенка"
            Coffee.LATTE -> "Мягкий"
        }
    }
}
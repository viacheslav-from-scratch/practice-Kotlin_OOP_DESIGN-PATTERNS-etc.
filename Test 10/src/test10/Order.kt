package test10

data class Order constructor(
    var coffee: Coffee,
    var size: Size,
    var withMilk: Boolean
) {
    fun price(): Double{
        if (withMilk){
            coffee.price = coffee.price * size.multiplier * 1.2

            return coffee.price
        }
        else {
            coffee.price = coffee.price * size.multiplier

            return coffee.price

        }
        return coffee.price
    }
}

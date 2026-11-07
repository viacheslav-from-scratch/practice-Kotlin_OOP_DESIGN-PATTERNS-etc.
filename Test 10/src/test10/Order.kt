package test10

data class Order constructor(
    var coffee: Coffee,
    var size: Size,
    var withMilk: Boolean
) {
    fun price(): Double{
        var basePrice = coffee.price
        if (withMilk){
            basePrice = coffee.price * size.multiplier * 1.2

            return basePrice
        }
        else {
            basePrice = coffee.price * size.multiplier

            return basePrice

        }
    }
}

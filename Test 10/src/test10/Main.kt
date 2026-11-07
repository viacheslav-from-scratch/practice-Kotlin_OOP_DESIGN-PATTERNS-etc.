package test10

fun main(){
    val Order1 = Order(Coffee.ESPRESSO, Size.SMALL, false)
    val Order2 = Order(Coffee.LATTE, Size.LARGE, true)
    val Order3 = Order(Coffee.CAPPUCCINO, Size.MEDIUM, true)
    val Order4 = Order(Coffee.LATTE, Size.MEDIUM, false)
    val Order5 = Order(Coffee.CAPPUCCINO, Size.LARGE, true)

    println("${Order1.coffee.name} ${Order1.size} - ${Order1.coffee.describe()} - %.2f".format(Order1.price()))
    println("${Order2.coffee.name} ${Order2.size} - ${Order2.coffee.describe()} - %.2f".format(Order2.price()))
    println("${Order3.coffee.name} ${Order3.size} - ${Order3.coffee.describe()} - %.2f".format(Order3.price()))
    println("${Order4.coffee.name} ${Order4.size} - ${Order4.coffee.describe()} - %.2f".format(Order4.price()))
    println("${Order5.coffee.name} ${Order5.size} - ${Order5.coffee.describe()} - %.2f".format(Order5.price()))
}

//ESPRESSO, SMALL, без молока
//LATTE, LARGE, с молоком
//CAPPUCCINO, MEDIUM, с молоком
//LATTE, MEDIUM, без молока
//CAPPUCCINO, LARGE, с молоком
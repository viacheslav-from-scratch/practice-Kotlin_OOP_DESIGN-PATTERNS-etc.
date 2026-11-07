package test9

fun main(){
//    val Coffee = Coffee()

    val SlavaChoose = Coffee.EXPRESSO
    val withMilk = true
    val Size = Size.STANDARD

    for (coffee in Coffee.entries)
//        for (size in Size.entries)
        if(coffee==SlavaChoose){
            if (withMilk == coffee.addMilk()){
                // Slava choose Standard Size. it is SMALL by the way.
//                coffee.price *= Size.

                coffee.addMilk()

                println(coffee.price)
            }
        }
}
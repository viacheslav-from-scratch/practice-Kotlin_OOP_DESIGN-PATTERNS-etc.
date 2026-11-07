package test12

fun main(){
    val aquarium1 = Aquarium(0)
    println(aquarium1.fishStatus())
    println("Total feeding cost is: %.2f".format(aquarium1.feedingCost()))

    val aquarium2 = Aquarium(12)
    println(aquarium2.fishStatus())
    println("Total feeding cost is: %.2f".format(aquarium2.feedingCost()))

    val aquarium3 = Aquarium(50)
    println(aquarium3.fishStatus())
    println("Total feeding cost is: %.2f".format(aquarium3.feedingCost()))
}
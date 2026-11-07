package test12

class Aquarium constructor(
    var fishAmount: Int
) {
    val pricePerFish: Double = 0.25

    fun fishStatus(): String {
        if (fishAmount < 0){
            System.err.println("Fish amount cannot be negative")
            System.exit(1)
        }
        if(fishAmount == 0){
            return "Empty tank"
        }
        else if (fishAmount <= 39 && fishAmount != 0) {
            return "Got fish!"
        }

        return "That's a lot of fish!"
    }

    fun feedingCost(): Double {
        var totalCost: Double = 0.0
        for (i in 1..fishAmount){
            totalCost += pricePerFish
        }

        return totalCost
    }
}
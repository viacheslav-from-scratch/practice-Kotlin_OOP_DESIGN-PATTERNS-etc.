package minitest12

fun main(){
    val constFruits: MutableList<String> = mutableListOf("Apple", "Banana", "Cherry")
    val fruits: MutableList<String> = mutableListOf("Apple", "Banana", "Cherry")
    println("Size: ${fruits.size}")

    fruits.remove("Banana")

    fruits.forEachIndexed { index, fruit -> println("$index: $fruit") }

    println("Apple" in fruits)
    println("Banana" in fruits)
}
package minitest11

fun main() {
    val fruits: MutableList<String> = mutableListOf("Apple", "Banana", "Cherry")
    println("Size: ${fruits.size}")

    fruits.remove("Banana")

    for(fruit in fruits)
        println(fruit)
}
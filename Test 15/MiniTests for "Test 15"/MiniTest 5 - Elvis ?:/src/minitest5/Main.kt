package minitest5

fun main(){
    val city: String? = "Varna"
    val nothing: String? = null

    println(city?.length ?: 0)
    println(nothing?.length ?: 0)
}
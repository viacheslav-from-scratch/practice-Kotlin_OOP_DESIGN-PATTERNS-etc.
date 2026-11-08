package minitest6

fun main(){
    val ivan = User("Ivan", "ivan@mail.bg")
    val maria = User("Maria")

    println(ivan.emailDomain())
    println(maria.emailDomain())
}
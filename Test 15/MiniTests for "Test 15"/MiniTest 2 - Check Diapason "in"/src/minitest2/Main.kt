package minitest2

fun isWorkingHour(hour: Int): Boolean{
    if(hour in 9..17){
        return true
    }
    return false
}

fun main(){
    println(isWorkingHour(8))
    println(isWorkingHour(9))
    println(isWorkingHour(17))
}
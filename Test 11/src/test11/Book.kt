package test11

import javax.xml.crypto.dom.DOMCryptoContext
import kotlin.math.roundToInt
import kotlin.math.roundToLong


data class Book constructor(
    val title: String,
    val genre: Genre,
    val pages: Int
) {
    fun readingTime(book: Book): Int {
        var tempVar = book.pages
        var hours = 0

        while (tempVar > 0){
            tempVar -= 50
            hours += 1
        }
        return hours
    }
}

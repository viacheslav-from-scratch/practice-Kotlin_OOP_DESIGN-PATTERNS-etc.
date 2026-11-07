package test11

fun addPlus1(): Int {
    return 1;
}

fun main(){
    val book1 = Book("Hobbit", Genre.FANTASY, 310)
    val book2 = Book("Cosmos", Genre.SCIENCE, 396)
    val book3 = Book("SPQR", Genre.HISTORY, 608)
    val book4 = Book("Dune", Genre.FANTASY, 412)
    var count = 0
    var allPages = 0

    println("${book1.title} (${book1.genre}) - ${book1.readingTime(book1)} h"); count += addPlus1()
    println("${book2.title} (${book2.genre}) - ${book1.readingTime(book2)} h"); count += addPlus1()
    println("${book3.title} (${book3.genre}) - ${book1.readingTime(book3)} h"); count += addPlus1()
    println("${book4.title} (${book4.genre}) - ${book1.readingTime(book4)} h"); count += addPlus1()

//    for (i in 1..count) {
//        allPages += book1.readingTime(book1)
//    }
    allPages += book1.pages
    allPages += book2.pages
    allPages += book3.pages
    allPages += book4.pages

    println("Total pages: $allPages")
}
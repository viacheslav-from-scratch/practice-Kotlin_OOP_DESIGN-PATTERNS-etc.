package test16

fun main(): Unit {
    val group1 = Group("KST-21")

    group1.addStudent("Anna", "Varna")
    group1.addStudent("Oleg", "Sofia")
    group1.addStudent("Velislav", "Ruse")
    group1.addStudent("Test", "Ruse")

    group1.setGrade("Anna", 85)
    group1.setGrade("Oleg", 56)
    group1.setGrade("Velislav", 99)
    group1.setGrade("Test", 0)

    println("average grade: ${group1.avarage()}")

    group1.printReport()
}
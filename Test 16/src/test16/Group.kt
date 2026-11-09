package test16

class Group constructor(val name: String) {
    private val students: MutableList<String> = mutableListOf()
    private val grades: MutableMap<String, Int> = mutableMapOf()
    private val cities: MutableSet<String> = mutableSetOf()

    fun addStudent(student: String, city: String): Unit {
        students.add(student)
        cities.add(city)
        println("Added $student from $city")
    }

    fun removeStudent(student: String): Unit {
        if (!student.isEmpty()) {
            students.remove(student)
            grades.remove(student)
            println("Removed $student")
        }
        else {
            println("No student $student")
        }
    }

    fun setGrade(student: String, grade: Int): Unit {
        if (!student.isEmpty()) {
            grades.set(student, grade)
            println("$student got $grade")
        }
        else {
            println("No student $student")
        }
    }

    fun avarage(): Double {
        var hasGradeCount: Int = 0
        var totalGradeByCount: Double = 0.0
        var result: Double = 0.0

        grades.forEach { (key, value) -> if (value.toDouble() != 0.0) hasGradeCount++ }
        grades.forEach { (key, value) -> if (value.toDouble() != 0.0) totalGradeByCount+=value }

        result = totalGradeByCount/hasGradeCount

        return result
    }

    fun printReport(): Unit {
        println("\n\nprintReport:\n")

        // <name>: <число студентов> students from <число городов> cities
        for (student in students)
            println("$student: ${students.size} students from ${cities.size} cities")

        // Cities: <множество целиком>
            println("Cities: ${cities}")

//        for (student in students) {

//        }
//        grades.forEach { (key, value) -> key.forEachIndexed { index, ch -> println("#$index $key: $value") } }
//        students.forEachIndexed { index, student -> println("#$index $student: ") }

//        for (i in 1 until students.size)
        var index = 1
        grades.forEach { (key, value) -> if (value.toDouble() != 0.0) println("#${index++} $key: $value") else println("#${index++} $key: no grade") }
//            println("#$i ${students[i]}: ${grades.forEach { (key, value) ->  }}")
        // #<number> <student>: <grade>
        // #<number> <student>: no grade

    }
}
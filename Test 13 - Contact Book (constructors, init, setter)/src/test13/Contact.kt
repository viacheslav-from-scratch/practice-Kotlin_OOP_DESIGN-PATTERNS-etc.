package test13

class Contact (var id: Int, val email: String){
    constructor(email: String) : this(0, email)

    init {
        println("Created contact $id")
    }


    fun setEmail(email: String): String {
        var customEmail = ""

        for (i in 0..<email.length){
            if (email[i] != ' ')
                customEmail += email[i]
        }

        return customEmail
    }
}
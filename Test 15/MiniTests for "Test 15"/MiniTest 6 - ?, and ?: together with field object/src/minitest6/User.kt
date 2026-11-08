package minitest6

data class User(var name: String, var email: String?) {
    constructor(name: String) : this(name, null)

    fun emailDomain(): String? {
        return email?.substringAfter("@") ?: "no email"
    }
}

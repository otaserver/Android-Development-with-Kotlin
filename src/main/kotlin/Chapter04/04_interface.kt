//接口中包含了属性和方法实现。
interface EmailProvider {

    val email: String

    val nickname: String
        get() = email.substringBefore("@")

    fun validateEmail() = nickname.isNotEmpty()
}

class User(override val email: String) : EmailProvider

fun main(args: Array<String>) {
    val user = User("joey@test.com")
    println(user.validateEmail())
    println(user.nickname)
}
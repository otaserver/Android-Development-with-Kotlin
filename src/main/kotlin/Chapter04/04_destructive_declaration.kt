package Chapter04

data class Person(val firstName: String, val lastName: String, val height: Int)

//书110页解构声明的代码
fun main(args: Array<String>) {
    val person = Person("Igor", "Wojda", 180)
    var (firstName, lastName, height) = person
    println(firstName)
    println(height)
}
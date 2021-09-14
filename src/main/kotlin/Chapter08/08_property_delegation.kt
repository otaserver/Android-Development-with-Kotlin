package Chapter08

class User(val map: MutableMap<String, Any>) {
    var name: String by map
    var kotlinProgrammer: Boolean by map
    override fun toString(): String = "Name: $name, Kotlin programmer: $kotlinProgrammer"
}

fun main(args: Array<String>) {

    val map = mutableMapOf(
        "name" to "Marcin",
        "kotlinProgrammer" to true
    )

//    val user = User(map)
    val user = User(map as MutableMap<String, Any>)//必须增加造型语句才能执行。

    println(user)
    user.map.put("name", "Igor")
    println(user)
    user.name = "Michal"
    println(user)
}
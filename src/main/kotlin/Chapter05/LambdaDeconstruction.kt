package Chapter05

data class User(val name: String, val surname: String, val phone: String)


/**
 * @author scott
 * @date 2021/9/8
 * 书162页的lambda的解构机制
 */
fun main(args: Array<String>) {

    var user: User = User("lisd", "scott", "1358186")

    //这是一个标准的解构示例
    val (dename, desurname, dephone) = user
    println(dename)

    //这是一个lambda的解构示例
    val showUser: (User) -> Unit = { (name, surname, phone) ->
        println("$name $surname have phone number:$phone")
    }
    showUser(user)

    //又一个解构示例
    val map = mapOf(1 to 2, 2 to "A")
    //解析：如果使用kotlin的自动判断，应该是int，Any的参数类型。
    val text = map.map { (key, value) -> "$key:$value" }
    //解析：map后面是{}，表示为lambda表达式，输入是key，vlaue，输出是连接的字符串，有返回值。
    println(text)


}
package Chapter05

/**
 * @author scott
 * @date 2021/9/8
 * 书上176页例子。
 */

class Client {
    fun wantToEat(food: String): Boolean {
        //解析：这是一个标准函数，输入是String类型的food，输出为boolean类型。
        if (food.length > 4) return true
        return false
    }
}

fun main(args: Array<String>) {
    val func: (Client, String) -> Boolean = Client::wantToEat
    val client = Client()//此句是生成一个对象。使用的是一个对象来调用操作。
    println(func.invoke(client, "ice"))
}
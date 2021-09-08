package Chapter05

/**
 * @author scott
 * @date 2021/9/8
 * 书中175例子,演示【函数引用】。
 */

fun isOdd(i: Int) = i % 2 == 1

fun greet() {
    println("hello!")
}

fun salute() {
    println("Have a nice day")
}

val todoList: List<() -> Unit> = listOf(::greet, ::salute)

//解析：这是又调用了String的顶级函数。？为什么不用.呢？
val nonEmpty = listOf("A", "", "B", "").filter(String::isNotEmpty)

fun main(args: Array<String>) {

    var list: List<Int> = listOf(2, 9, 11, 4, 89)
    //使用lambda调用，注意:是{}，而不是()
    println(list.filter { isOdd(it) })

    //isOdd已经定义为顶级函数。为了将顶级函数用作某个值，需要使用到函数引用。即使用2个冒号以及函数名。比如(::functionName)
    println(list.filter(::isOdd))

    for (task in todoList) {
        task()//这里的方法名需要和上方保持命名一致。
    }

    //这里使用了【函数引用】，使用了顶级函数isOdd。
    val predicate: (Int) -> Boolean = ::isOdd
    //解读： (Int) -> Boolean为 函数类型。这里没有使用lambda表达式，而是使用了【函数引用】。
    println(predicate.invoke(3))

    println(nonEmpty)

}


package Chapter05

/**
 * @author scott
 * @date 2021/9/8
 * 书146页上面的例子
 */

fun main(args: Array<String>) {
    val a: (Int) -> Int = { i -> i * 2 }
    //解读：【函数类型】为输入int，输出int。lambda表达式参数是i，函数是*2，有返回值为*2。
    val c: (String) -> Unit = { s -> println(s) }
    //解读：【函数类型】输入字符串，无输出。lambda表达式参数是s，函数体为打印。没有返回值。

    //省略了【参数类型】，kotlin可以自动进行推断。
    val b = { 4 }
    //解析：由于省略了【参数类型】,从lambda表达式推断，由于没有输入参数，所以参数类型应该是()->INT

    val d = { s: String -> println(s) }
    //解析：参数类型为（String）->Unit

    val e = { i: Int -> i * 2 }
    //解析：参数类型为（Int）->Int


}
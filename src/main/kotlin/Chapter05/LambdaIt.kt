package Chapter05

/**
 * @author scott
 * @date 2021/9/8
 * 演示lambda表达式中it关键字的使用。
 */
fun main(args: Array<String>) {
//    it关键字的使用的场景是：
//    1.只有一个参数。
//    2.可以做出类型判断

    val a: (Int) -> Int = { it * 2 }
    //解读： 【函数参数】为输入Int，输出Int。lambda表达式因为只有一个参数，且参数类型可以推断就可以写为it。等价于下面定义。
    val aEqual: (Int) -> Int = { i -> i * 2 }//其实这个例子也省略了类型定义。补充完整的表达式如下。
    val aTotal: (Int) -> Int = { m: Int -> m * 2 } //这个算是完整的表达式，包括【函数参数】和lambda表达式。

    val c: (String) -> Unit = { println(it) }//等价于下面表达式
    val cTotal: (String) -> Unit = { s: String -> println(s) }


}
package Chapter07

/**
 * @author scott
 * @date 2021/9/13
 * 包含接收者的函数类型，或包含接收者的函数字面值。
 */
fun main() {


    var power: Int.(Int) -> Int = { n -> (1..n).fold(1) { acc, _ -> this * acc } }
    //定义power变量是一个扩展函数。扩展的是Int，  函数类型，接收Int为参数，返回Int
    //解析：（type of parameters）-> return type  函数类型。

    //演示包含接收者的函数
    var power2 = fun Int.(n: Int) = (1..n).fold(1) { acc, _ -> this * acc }
    //TODO：看不懂。

    val result = 3.power(2)
    println(result)
}
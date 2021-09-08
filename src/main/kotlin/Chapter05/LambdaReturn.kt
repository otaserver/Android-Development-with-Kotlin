package Chapter05

/**
 * @author scott
 * @date 2021/9/7
 * 演示了使用lambda的标签处返回
 */

//原文地址:https://blog.csdn.net/achenyuan/article/details/83684878

fun main(args: Array<String>) {
    println("测试函数参数是由fun定义，直接返回")
    foo()

    println("测试函数参数是由Lamdba定义")
    bar() //执行时都没有打印遍历完成字样。这就是引入标签处返回的原因。

    println("测试函数参数是由Lamdba定义,且标签处返回")
    labelReturn()
}

fun foo() {
    listOf(1, 2, 3).forEach(fun(item: Int) {
        if (item == 2) return // 局部返回到匿名函数的调用者，即 forEach 循环
        println("当前遍历的值是 $item")
    })
    println("list集合遍历完成")
}

/**
 * 传入作为的参数的函数，使用了lambda方法。
 */
fun bar() {
    listOf<Int>(1, 2, 3).map { item ->
        if (item == 2) return
        println("当前遍历的值是 $item")
    }
    println("list集合遍历完成")
}

/**
 * 使用标签处返回
 */
fun labelReturn() {
    listOf<Int>(1, 2, 3).map lit@{ item ->
        if (item == 2) return@lit
        println("当前遍历的值是 $item")
    }
    println("list集合遍历完成")
}

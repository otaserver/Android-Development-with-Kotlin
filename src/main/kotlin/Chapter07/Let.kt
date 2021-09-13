package Chapter07

/**
 * @author scott
 * @date 2021/9/13
 * 演示let扩展函数：let默认当前这个对象作为闭包的it参数，返回值是函数的最后一行或者指定return结果。
 * let 和 apply 类似， 唯一的不同是返回值，let返回的不是原来的对象，而是闭包里面的值。
 */
fun main(args: Array<String>) {
    println(testLet())

    val name = "Alfred".let {
//        println(it)
//        println(it.length)
        "张三" //没指定返回值时，默认返回值为闭包的最后一行
    }

    println(name)
}

fun testLet(): Int {
    "Alfred".let {
//        println(it)
//        println(it.length)
        return 999  //指定返回值为999
    }
}
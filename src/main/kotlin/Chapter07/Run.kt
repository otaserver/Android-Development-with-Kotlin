package Chapter07

/**
 * @author scott
 * @date 2021/9/13
 */
fun main(args: Array<String>) {
    val name = "Alfred".run {
        println(this)
        println(this.length)
        "张三" //返回最后一行
    }

    println(name)
    println(testRun())
}

fun testRun(): String {
    "Alfred".run {
        return "jack" //指定返回
    }
}
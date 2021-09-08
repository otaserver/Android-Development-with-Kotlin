package Chapter05


/**
 * @author scott
 * @date 2021/9/8
 * 书中154页例子。这个例子挺NB，可以输入一个自定义的函数做参数。也就是高阶函数。
 * 此例子演示最后一个参数是函数，可以把代码提取到括号之后，使其看起来位于参数外部。
 */

fun addLogs(tag: String, f: () -> Unit) {
    println("$tag started")
    val startTime = System.currentTimeMillis()
    f()
    val endTime = System.currentTimeMillis()
    println("$tag finished,it took " + (endTime - startTime))

}

fun main(args: Array<String>) {
    addLogs("Sleeper") {
        Thread.sleep(1000)
    }
}
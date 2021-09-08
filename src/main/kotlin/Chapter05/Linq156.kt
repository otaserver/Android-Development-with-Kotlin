package Chapter05

/**
 * @author scott
 * @date 2021/9/8
 * 书上156页演示linq风格的代码
 */
fun linq() {
    var strings: List<String> = listOf("Python", "c#", "C", "kotlin", "java")
//    println(strings.filter { it.length > 4 }.map { it.toUpperCase() })
    //解析：println()内的参数为一个字符串列表。
    //filter后面跟随的是{}而不是(),表明他是一个lambda函数。使用it代表单个参数，且类型可以通过上下文推断。
    //且这里省略了参数定义，只有函数体。这里it就是String类型。
    //改写为完整表达式如下方
    println(strings.filter { s: String -> s.length > 4 }.map { s: String -> s.toUpperCase() })
}

fun main(args: Array<String>) {
    linq()
}
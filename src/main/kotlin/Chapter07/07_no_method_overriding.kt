class A2 {
    fun foo() {
        println("foo from A2")
    }
}

fun A2.foo() {
    //解析：这个语法是扩展函数的语法。
    println("foo from Extension")
}

fun main(args: Array<String>) {
    A2().foo()
    //如果成员函数和扩展函数重名，则优选成员函数。
}
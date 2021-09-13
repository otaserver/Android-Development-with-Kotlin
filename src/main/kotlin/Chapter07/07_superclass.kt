//书上205页例子
open class A3 {
    fun foo() {
        println("foo from A3")
    }
}

class B3 : A3()

fun B3.foo() {
    //解析：语法是扩展函数。
    println("foo from Extension")
}

fun main(args: Array<String>) {
    A3().foo()
    B3().foo()//此例：说明即使是超类中的方法也将由于扩展函数。
}
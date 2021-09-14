package Chapter05

class AA {
    fun foo() {
        println("foo from AA")
    }
}

fun AA.foo() {
    println("foo from Extension")
}

fun main(args: Array<String>) {
    AA().foo()
    //这个容易错！

    callFunction()//这里演示调用顶级函数。连import都不需要，很像c，c++的调用方式。因为kotlin会最终编译为java。
}
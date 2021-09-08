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
}
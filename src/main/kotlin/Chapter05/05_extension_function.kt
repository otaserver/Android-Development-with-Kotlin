package Chapter05

abstract class AClass
class BClass : AClass()

fun AClass.foo() {
    println("foo(AClass)")
}

fun BClass.foo() {
    println("foo(B)")
}

fun callFunction() {
    println("就是测试顶级函数的调用")
}

fun main(args: Array<String>) {
    val b = BClass()
    b.foo()   //foo(B)
    (b as AClass).foo()  //foo(AClass)
    val a: AClass = b
    a.foo() //foo(AClass)
}
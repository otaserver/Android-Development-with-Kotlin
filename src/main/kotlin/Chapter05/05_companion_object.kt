package Chapter05

class A {
    companion object {}
}

fun A.Companion.foo() {
    print(2)
}

//伴生对象的例子。这个不是第4章的示例吗？
fun main(args: Array<String>) {
    A.foo()
}

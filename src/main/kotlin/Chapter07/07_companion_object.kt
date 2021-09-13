class Ac {
    companion object {}
}


fun Ac.Companion.foo() {
//解析：看类名有Ac开头，说明这是一个扩展函数。并且扩展的是伴生函数。
    print(2)
}

fun main(args: Array<String>) {
    Ac.foo()//其实是把伴生对象的关键字Companion省略了。
}
package test

class Box<T>

val intBox = Box<Int>()
val stringBox = Box<String>()

//使用reified查看真实类型。
inline fun <reified T> printype(s: Any) {
    println(T::class.isOpen)
    println(T::class.toString())
    println(T::class.java)

    //猜测s因为是类型擦除原因，就是没办法获得。
    println(s.javaClass)
    println(s::class.toString())
    println(s::class.java)
    //TODO:这里虽说保留了泛型的类型，也是因为传入的关系。也不是通过s自动判断类型啊？？？

}

/**
 * 泛型擦除的示例。
 */
fun main(args: Array<String>) {
    println(intBox.javaClass)
    println(stringBox.javaClass)
    printype<Int>(stringBox)
}
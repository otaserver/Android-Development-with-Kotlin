import kotlin.properties.Delegates//这源码质量也太差了，都没有import

//TODO： name为属性，但是为什么又使用了 observable委托，意义何在？
//书上解释：每次设置某个值时（set value方法将被调用），源自声明的lambda函数将被调用。
//var name: String by Delegates.observable("Empty") { property, oldValue, newValue ->
//因为property声明了但没使用，所以可以用_来代替。见下行代码。
var name: String by Delegates.observable("Empty") { _, oldValue, newValue ->
    println("$oldValue -> $newValue")
}

fun main(args: Array<String>) {
    name = "Martin"
    name = "Igor"
    name = "Igor"
}

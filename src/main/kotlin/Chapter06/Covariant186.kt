package Chapter06

/**
 * @author scott
 * @date 2021/9/9
 * 书186页，kotlin协变的示例
 */
class Box<T>

fun sum(list: Box<out Number>) {
    //
}

fun main(args: Array<String>) {
//    sum(Box<Any>())//异常，因为只能实例化子类，
    sum(Box<Number>())
    sum(Box<Int>())//实例化子类，这种叫协变。
}

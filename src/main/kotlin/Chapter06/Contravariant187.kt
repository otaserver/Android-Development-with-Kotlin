package Chapter06

/**
 * @author scott
 * @date 2021/9/9
 * 187页逆变的例子
 */
fun sum187(list: Box<in Number>) {
    //
}

fun main(args: Array<String>) {
    sum187(Box<Any>())//正常，可以传入父类
    sum187(Box<Number>())
//    sum187(Box<Int>())//异常，不能传入子类。
}
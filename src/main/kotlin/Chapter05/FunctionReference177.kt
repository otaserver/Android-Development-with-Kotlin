package Chapter05

/**
 * @author scott
 * @date 2021/9/8
 * 书上177，主要演示静态方法调用【函数引用】，其实就是用了伴生对象。
 */
object MathHelpers {
    //直接定义为单子模式
    fun isEven(i: Int) = i % 2 == 0
}

class Math {
    companion object {
        //使用伴生对象定义，其实就是静态方法。
        fun isOdd(i: Int) = i % 2 == 1
    }
}

fun main(args: Array<String>) {
    val evenPredicate: (Int) -> Boolean = MathHelpers::isEven
    val oddPredicate: (Int) -> Boolean = Math.Companion::isOdd//注意：Companion首字母大写

    val numbers = 1..10
    val even = numbers.filter(evenPredicate)//示例为调用了【函数引用】
    val odd = numbers.filter(oddPredicate)

    println(even)
    println(odd)

}
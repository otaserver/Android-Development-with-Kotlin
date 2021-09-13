package Chapter07

class User(val points: Int)

/**
 * @author scott
 * @date 2021/9/10
 */
fun main(args: Array<String>) {
    val users = listOf(User(10), User(1_000), User(10_000))
    val points = users.map { it.points }.sum()
    println(points)

    val pointsSumBy = users.sumBy { it.points }
    println(pointsSumBy)

    val list = listOf(12, 41, 2)
    println(list.sortedBy { "$it" })  //?it指的是什么？？

    //一个自定义比较器的例子。
    val comparator = Comparator<String> { e1, e2 -> e1.length - e2.length }
    val minByLen = listOf("ppp", "z", "as")
        .sortedWith(comparator)
    println(minByLen)


}
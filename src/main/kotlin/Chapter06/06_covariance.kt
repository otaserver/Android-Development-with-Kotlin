//书上191页，List具有协变特性。covariance就是协变的意思。

fun printElements(list: List<Any>) {
    for (e in list) print(e)
}

//演示list具有协变特性。
fun main(args: Array<String>) {
    val intList = listOf(1, 2, 3, 4)
    val anyList = listOf<Any>(1, 'A')//第一个数字，第二个是char，不是String，因为String需要用”“
    printElements(intList)
    println("")
    printElements(anyList)
}
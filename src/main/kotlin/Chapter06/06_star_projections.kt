//书199页的星号投射
fun printSize(list: MutableList<*>) {//这里不能使用Any代替*。
    println(list.size)
}

fun main(args: Array<String>) {
    val stringList = mutableListOf("5", "a", "2", "d")
    val intList = mutableListOf(3, 7)
    printSize(stringList)
    printSize(intList)
}
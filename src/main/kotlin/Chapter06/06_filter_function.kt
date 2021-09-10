fun main(args: Array<String>) {
    val fruits = listOf("Babana", "Orange", "Apple", "Blueberry")
    val bFruits = fruits.filter { it.startsWith("B") }
    //这不是第5章lambda的代码吗。这书的质量堪忧。
    println(bFruits)
}
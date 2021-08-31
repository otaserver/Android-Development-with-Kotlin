package Chapter02

fun printSum(a: Int, b: Int): Unit{
    val sum = a + b
}

fun main(args: Array<String>) {
    val p = printSum(1, 2) 
    println(p is Unit)
}

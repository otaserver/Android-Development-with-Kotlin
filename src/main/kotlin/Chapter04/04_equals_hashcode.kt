package Chapter04

data class Product(var name: String, var price: Double)

fun main(args: Array<String>) {
    val productA = Product("Spoon", 30.2)
    val productB = Product("Spoon", 30.2)
    val productC = Product("Fork", 17.4)
    println(productA == productA)
    println(productA == productB)
    println(productB == productA)
    println(productA == productC)
    println(productB == productC)
}
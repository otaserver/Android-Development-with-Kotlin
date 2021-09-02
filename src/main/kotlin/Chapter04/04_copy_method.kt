data class Product(var name: String, var price: Double)

fun main(args: Array<String>) {
    val productA = Product("Spoon", 30.2)
    println(productA)
    val productB = productA.copy(price = 15.8)
    println(productB)
}
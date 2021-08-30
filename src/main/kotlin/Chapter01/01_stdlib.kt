fun main(args: Array<String>) {
    val capitols = listOf("England" to "London", "Poland" to "Warsaw")
    for ((country, city) in capitols) {
        println("Capitol of $country is $city")
    }

    val text = capitols.map { (country, _) -> country.toUpperCase() }
                       .onEach { println(it) }
                       .filter { it.startsWith("P") }
                       .joinToString (prefix = "Countries starting from P are: ")
    // Prints: ENGLAND POLAND
    println(text) // Prints: Countries starting from P are POLAND
}
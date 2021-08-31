fun main(args: Array<String>) {
    val intRange = 1..5

    val charRange = 'A'..'B'

    for(value in intRange) { 
        if(value == 3) 
            continue 
 
        println("Outer loop: $value ") 
 
        for (char in charRange) { 
            println("\tInner loop: $char ") 
        } 
    } 
}
package Chapter06


@JvmName("intSum")
fun sum(ints: List<Int>) {
    println("ints")
}


fun sum(strings: List<String>) {
    println("String")
}

/**
 * @author scott
 * @date 2021/9/9
 */
//尽管重载的泛型类型不同，但是因为类型擦除特性，2个方法会冲突。编译期就不通过。
//解决办法是使用注解@JvmName来改名
//fun sum(ints:List<Int>){
//    println("ints")
//}


fun main(args: Array<String>) {
    val intList = listOf(1, 2, 3, 4)
    val anyList = listOf("1", "A")

    sum(intList)//由于kotlin中增加了JvmName，编译通过，调用还可以继续使用原来的命名。
//    intSum(intList)//这个intSum应该是从java里调用使用的名称。
    sum(anyList)
}
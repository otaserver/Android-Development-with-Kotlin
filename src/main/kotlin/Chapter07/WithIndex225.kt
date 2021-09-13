package Chapter07

/**
 * @author scott
 * @date 2021/9/10
 */
fun main(args: Array<String>) {
    //演示了withIndex的使用。
    listOf(9, 8, 7, 6).withIndex()//应该是返回了一个结构体，也就是析构IndexedValue。
        .filter { (i, _) -> i % 2 == 0 }//lambda函数，根据布尔值返回对象。 _表示针对未使用变量的下划线，为的是增加可读性。见书162页。
        .forEach { (i, v) -> println("$v at $i,") }//lambda函数，参数就是结构体i,v,函数体是打印

    val list1 = listOf(2, 2, 3, 3)
        .filterIndexed { index, _ -> index % 2 == 0 }
    println(list1)//2,3

    val list2 = listOf(10, 10, 10)
        .mapIndexed { index, i -> index * i }
    println(list2)//0,10,20

    val list3 = listOf(1, 4, 9)
        .forEachIndexed { index, i -> print("$index:$i,") }
    println(list3)//0:1,1:4,2:9  TODO:为啥多出来个kotlin.Unit啊？？
}
package Chapter07

/**
 * @author scott
 * @date 2021/9/13
 */
fun main() {
    val numbers = generateSequence(1) { it + 1 }
        //解析：种子是1，拉姆达函数是it+1.产生的序列如果不加限制，是无穷尽的。所以后面回用take来限定数量。
        .map { it * 2 }
        .take(10)
        .toList()
    println(numbers)

    //演示序列更加高效的原因，是根据整体的限制来执行语句。因为无限序列。
    val seq = generateSequence(1) { println("Generated ${it + 1}"); it + 1 }
        .filter {
            println("Processing of filter:$it"); it % 2 == 1
        }
        .map { println("processing map:$it");it * 2 }
        .take(2)//因为generateSequence是无限的，还是需要take函数来限制执行数量。
        .toList()

    println(seq)//1,3,5,7,9[2,6,10,14,18]

    //演示每一个方法都会执行，然后得到一个对象。对比序列处理方式是不同的。
    val list = (1..4).onEach { println("Generated $it") }
        .filter { println("Processing filter:$it"); it % 2 == 1 }
        .map { println("Processing map:$it"); it * 2 }
        .toList()

    println(list) //2,6
}
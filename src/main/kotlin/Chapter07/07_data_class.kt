data class Student(
    val name: String,
    val grade: Double,
    val passing: Boolean
)

val students = listOf(
    Student("John", 4.2, true),
    Student("Bill", 3.5, true),
    Student("John", 3.2, false),
    Student("Aron", 4.3, true),
    Student("Jimmy", 3.1, true)
)

//解析：使用lambda表达式确实简单，这里是流处理的方式！
val bestStudents = students.filter { it.passing }
    .withIndex()
    .sortedBy { it.value.grade }
    .take(3)//take是collection中的方法。
    .sortedBy { it.index }    //it.value,it.index是泛型提供的参数。
    .map { it.value }  //map是List中的方法，接收泛型参数<T>，it.value返回的是Student，
// 之所以可以使用个人猜测是因为把他定义为了顶级函数。且kotlin中函数是第一位的，方便简写代码。对比java是面向对象的。结构好，但代码层次多。


fun main(args: Array<String>) {
    //map有点像RxJava的转换的意思。
    println(bestStudents.map { it.name + "_" + it.grade })//一种不太标准的返回格式

    println(bestStudents.map { "${it.name}  ${it.grade}" })//这种方式是使用模板返回自定义格式的结果字符串的正确格式

    (1..5).map { it * 2 }.forEach(::print) //TODO: 2个冒号print代表什么？？
    (1..5).map { it * 2 }.forEach { println(it) }//改成lambda表达式

    val list = listOf(1, 2, 3, 4).map { it > 2 }// map为转换，最后转换结果为【false，false，true，true】
    println(list)

}
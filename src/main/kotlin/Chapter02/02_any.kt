package Chapter02

/**
 * @author scott
 * @date 2021/8/30
 */

fun main(args: Array<String>) {
//    var title = "kotlin"
//    title = 12 //错误，因为kotlin是强类型限制，title已经被kotlin判定为字符串

    var title: Any = "kotlin"//Any等价于java中的Object。
    title = 12 //正常


    val  array = arrayOf(1,2,3)//书中说这是Long类型？实测是int类型

    val  array2 = longArrayOf(1,2,3)

    val array3 = shortArrayOf(1,2,3)

    val array4 = Array(5) {it*2}//书中说答案是[0,2,4,8.10]? 实测是[0,2,4,6,8]
    array4.forEach { println(it)}

    val name="Eva"
    val message = "My name has ${name.length} characters"
    println(message)

    for(i in 1..3) println(i)  //书中44页的表达式错误！，应该为1..3

    //使用表达式的模板
    val age =18
    val message2 = "you are ${if (age <18) "young" else "of age"} person"
    println(message2)

    //52页的例子
    var array5 = arrayOf(1,2,3)
    for((index,value) in array5.withIndex()){
        println("Element at $index is $value")
    }

}
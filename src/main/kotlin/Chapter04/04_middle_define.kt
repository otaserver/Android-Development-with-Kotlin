package Chapter04

/**
 * @author scott
 * @date 2021/9/2
 * 中缀调用的例子，见书128页。
 */
//infix是中缀函数的关键字
data class Point(val x: Int, val y: Int) {
    infix fun moveRight(shift: Int) = Point(x + shift, y)
}

fun main(args: Array<String>) {
    //实例1：打印first和second属性
    val mountain = "Everest"
    var pair = mountain.to(8848)

    //为什么pari有first和second属性呢？猜测是由于to操作符做了类型变换。
    println(pair.first)
    println(pair.second)

    //to其实是字符串的方法
    var lisd = "111"
    var sss = lisd.to("222T")

    //实例2：自定义的中缀函数
    val pointA = Point(1, 4)
    val pointB = pointA moveRight 2
    println(pointB)

}
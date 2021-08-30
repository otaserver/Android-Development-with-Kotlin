fun main(args: Array<String>) {

    //自己新加的数据类，否则源码编译不通过
    data class Ball(var size: Int, val color: String)

    val ball = Ball(12, "Red")
    println(ball) // prints: Ball(size=12, color=Red)
    val smallBall = ball.copy(size = 3)
    println(smallBall) // prints: Ball(size=3, color=Red)
    smallBall.size++
    println(smallBall) // prints: Ball(size=4, color=Red)
    println(ball) // prints: Ball(size=12, color=Red)
}
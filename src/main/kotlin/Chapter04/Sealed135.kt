package Chapter04

/**
 * @author scott
 * @date 2021/9/14
 */
sealed class Vehicle()
open class Bus : Vehicle()
//sealed class Bus : Vehicle()//如果Bus是sealed状态就不能被继承。

fun main() {
    class SchoolBus : Bus()
}
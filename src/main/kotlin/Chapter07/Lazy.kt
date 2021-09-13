package Chapter07

/**
 * @author scott
 * @date 2021/9/13
 * lazy可以把非常耗费资源的操作延迟到第一次调用时加载。
 * 第一次调用println(name.value)时，才会初始化name，先执行for循环打印10次#，再初始化值为alfred。
 * 第二次调用println(name.value)时，name已经赋值为alfred，所以直接打印alfred。
 * 总结： 第一次调用时，lazy 闭包会调用。一般用在单例模式。
 */
fun main(args: Array<String>) {
    val name = lazy {
        for (i in 1..10) {
            print("# ")
        }
        "alfred"
    }

    println(name.value)
    println(name.value)
}
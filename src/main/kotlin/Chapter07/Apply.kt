package Chapter07

/**
 * @author scott
 * @date 2021/9/13
 */
fun main() {

    val runnable = Runnable {
        print("is running")
    }

//    改造前
//    val thread = Thread(runnable)
//    thread.isDaemon = true
//    thread.start()

    //apply改造后，
    //在闭包中我们配置线程实例为一个守护线程。闭包中的代码会在线程实例上运行。相比之前代码，精简许多。
    Thread(runnable).apply { isDaemon = true }.start()


}
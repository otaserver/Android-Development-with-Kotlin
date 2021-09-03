package Chapter04

/**
 * @author scott
 * @date 2021/9/2
 */
open class VideoPlayer {
    fun play() {
        println("基础类定义的Play video")
    }
}

interface Player {
    fun play()
    fun stop()
}

fun main(args: Array<String>) {

    //
    val player = object : VideoPlayer(), Player {
        var duration: Double = 0.0
        override fun stop() {
            println("override 实现的Stop Video")
        }
    }

    player.play()
    player.stop()
    player.duration = 12.5
}


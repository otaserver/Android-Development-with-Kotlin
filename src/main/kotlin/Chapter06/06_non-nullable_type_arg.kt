//书中184页例子。
open class Action
class ActionGroup<T : Action?>(private val list: List<T>) {
    //这里定义Action？，表示接收一个null对象。否则main中的第二个Action不能为null
    fun lastOrNull(): T? = list.lastOrNull()//因为lastOrNull返回可空，所以要求T?可空。
}

fun main(args: Array<String>) {
    val actionGroup = ActionGroup(listOf(Action(), null))
    println(actionGroup.lastOrNull())
}
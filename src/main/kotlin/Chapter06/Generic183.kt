package Chapter06

//这里为了方便确定action的名称，增加了一个构造器
open class Action2(val name: String) {
    //并增加toString方便打印时好看
    override fun toString(): String {
        return "Action2(name='$name')"
    }
}


/**
 * @author scott
 * @date 2021/9/9
 * 书中183页例子。
 */
class ActionGroup<T : Action2>(private val list: List<T>) {
    fun last(): T = list.last()
    fun lastOrNull(): T? = list.lastOrNull() //因为可能返回null，所以要求T?关键字。
}
//解读：ActionGroup为一个泛型T，泛型继承自类Action。
//(private val list:List<T>) 为构造函数。接收一个泛型T的list列表。
//问:为啥还有parivate 这个关键字？
//答：猜测应该和构造器有关，参看书193页。其实可以去掉private或是用var
//类中定义了一个方法last方法，返回泛型T对象。方法体简写，就是取list列表的最后一个元素。

fun main(args: Array<String>) {
    val actionGroupNull = ActionGroup<Action2>(listOf())
//    val action =actionGroupNull.last() //空列表返回异常。
//    println(action.name)

    val actionGroup = ActionGroup(listOf(Action2("first"), Action2("second")))
    println(actionGroup.last().name)

}
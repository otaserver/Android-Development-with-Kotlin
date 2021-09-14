package Chapter08

import kotlin.properties.Delegates.observable

/**
 * @author scott
 * @date 2021/9/13
 */
fun main() {
    var list: MutableList<Int> by observable(mutableListOf())
    { _, old, new -> println("List changed from $old to $new") }

    list.add(1)  //未修改属性，所以不打印。未使用setter
    list = mutableListOf(2, 3)  //打印List changed from 1 to 【2, 3】"
}
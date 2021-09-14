package Chapter08

import kotlin.properties.Delegates

/**
 * @author scott
 * @date 2021/9/14
 * 书上269页代码，看不懂，代码也不对。
 */
fun main() {
//    var list: List<String> by Delegates.vetoable(emptyList()) { _, old, new ->
//        new.size > old.size
//    }

    var list: List<String> by Delegates.vetoable(emptyList()) { prop, old, new ->
        if (new.size < 3) return@vetoable false
//        updateListView(new)
        println("do updateListView(new)")
        true
    }

    var listVetoable = listOf("A", "B", "C")
    println(listVetoable)
    listVetoable = listOf("A")
    println(listVetoable)


}


package Chapter07

/**
 * @author scott
 * @date 2021/9/10
 */
data class User2(val name: String, val surname: String) {
    override fun toString() = "$name $surname"
}

val users = listOf(
    User2("A", "A"),
    User2("B", "A"),
    User2("A", "B"),
    User2("B", "B")
)

//使用自定义的compareBy，因为顺序是surname排在线。
val sortedUsers = users.sortedWith(compareBy({ it.surname }, { it.name }))//使用lambda的例子。
val sortedUserz = users.sortedWith(compareBy(User2::surname, User2::name))//使用属性引用的例子。TODO：虽然能运行，但还是不太理解。

val grouped = listOf("ala", "alan", "mulan", "malan").groupBy { it.first() }


fun main() {
    println(sortedUsers)//AA，BA，AB，BB
    println(sortedUserz)//AA，BA，AB，BB

    println(grouped)//ala,alan,malan,mulan TODO:为啥结果是mulan在malan前方？？


}


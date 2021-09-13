package Chapter07

/**
 * @author scott
 * @date 2021/9/13
 */
class Person(val name: String, val age: Int, val sex: String) {

    fun showName() {
        println(name)
    }

    fun showAge() {
        println(age)
    }

    fun showSex() {
        println(sex)
    }
}

fun main(args: Array<String>) {
    val person = Person("alfred", 29, "男")
    //普通写法，多次声明persion
    person.showName()
    person.showSex()
    person.showAge()

    //使用with写法变得简洁。
    with(person) {
        showName()
        showSex()
        showAge()
    }
}
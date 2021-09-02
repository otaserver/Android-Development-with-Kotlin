class Person {
    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

//原版代码是没有构造参数的。所以编译都不通过。
fun main(args: Array<String>) {
    Person("max", 4)
}
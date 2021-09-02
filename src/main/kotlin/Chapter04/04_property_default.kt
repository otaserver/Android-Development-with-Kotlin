class Fruit2(var weight: Double) {
    val isHeavy = weight > 20//此示例演示90页的属性默认值，当类构建过程中，该值仅计算一次。且不会发生变化。

    val heavy
        //自定义get可以随着调用，自动计算新值。
        get() = weight > 20
}


fun main(args: Array<String>) {
    var fruit = Fruit2(7.0)
    println(fruit.isHeavy)
    println(fruit.heavy)

    fruit.weight = 30.5

    println(fruit.isHeavy)
    println(fruit.heavy)
}
package Chapter04

/**
 * @author scott
 * @date 2021/9/2
 */
class Car {

    init {//init在构造时会执行。
        count++;  //可以访问伴生对象里的变量。
        println("Car created")
    }

    companion object { //省略了伴生对象的名称定义
        var count: Int = 0
            private set

        init {//注意，init这里也是关键字。
            println("Car Companion object created")//只会打印一次
        }
    }
}

//这个例子挺好的，为什么官方代码里没给啊？，这本书的质量也是挺堪忧的。
fun main(args: Array<String>) {
    println(Car.count) //0
    Car()
    Car()
    println(Car.count)//2
}